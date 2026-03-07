package net.maketendo.tardifmod.utils;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ShapeUtil {

    private final List<VoxelShape> shapes = new ArrayList<>();

    private ShapeUtil() {}

    public static ShapeUtil builder() {
        return new ShapeUtil();
    }

    /**
     * Add a box using position + size (Blockbench coords 0–16)
     *
     * @param x starting X
     * @param y starting Y
     * @param z starting Z
     * @param width X size
     * @param height Y size
     * @param length Z size
     */
    public ShapeUtil box(
            double x, double y, double z,
            double width, double height, double length
    ) {
        shapes.add(Shapes.box(
                x / 16.0,
                y / 16.0,
                z / 16.0,
                (x + width) / 16.0,
                (y + height) / 16.0,
                (z + length) / 16.0
        ));
        return this;
    }

    /**
     * Build the merged shape
     */
    public VoxelShape build() {
        return shapes.stream()
                .reduce(Shapes.empty(), Shapes::or);
    }

    public static VoxelShape rotateY(VoxelShape shape, Direction direction) {
        int times = switch (direction) {
            case EAST  -> 1;
            case SOUTH -> 2;
            case WEST  -> 3;
            default    -> 0;
        };

        return rotateY(shape, times);
    }

    public static VoxelShape rotateY(VoxelShape shape, int times) {
        VoxelShape result = shape;

        for (int i = 0; i < times; i++) {
            VoxelShape rotated = Shapes.empty();

            for (AABB box : result.toAabbs()) {
                rotated = Shapes.or(rotated,
                        Shapes.box(
                                1.0 - box.maxZ,
                                box.minY,
                                box.minX,
                                1.0 - box.minZ,
                                box.maxY,
                                box.maxX
                        )
                );
            }

            result = rotated;
        }

        return result;
    }

}

