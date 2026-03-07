package net.maketendo.tardifmod.client.animations.tardis;


import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class PoliceBoxAnimations {
	public static final AnimationDefinition door_right_open = AnimationDefinition.Builder.withLength(1.0F)
			.addAnimation("RightDoor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2F, KeyframeAnimations.degreeVec(0.0F, 77.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.36F, KeyframeAnimations.degreeVec(0.0F, 72.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.52F, KeyframeAnimations.degreeVec(0.0F, 77.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.64F, KeyframeAnimations.degreeVec(0.0F, 75.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.76F, KeyframeAnimations.degreeVec(0.0F, 77.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition door_left_open = AnimationDefinition.Builder.withLength(1.0F)
			.addAnimation("LeftDoor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.24F, KeyframeAnimations.degreeVec(0.0F, -77.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.35F, KeyframeAnimations.degreeVec(0.0F, -72.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.49F, KeyframeAnimations.degreeVec(0.0F, -77.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.63F, KeyframeAnimations.degreeVec(0.0F, -75.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.77F, KeyframeAnimations.degreeVec(0.0F, -77.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition left_door_close = AnimationDefinition.Builder.withLength(0.96F)
			.addAnimation("LeftDoor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -77.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2057F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.3429F, KeyframeAnimations.degreeVec(0.0F, -7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.48F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.6171F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7543F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("LeftDoor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -77.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.2057F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.3429F, KeyframeAnimations.degreeVec(0.0F, -7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.48F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.6171F, KeyframeAnimations.degreeVec(0.0F, -2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.7543F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();

	public static final AnimationDefinition right_door_close = AnimationDefinition.Builder.withLength(0.8F)
			.addAnimation("RightDoor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 77.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.24F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.52F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.68F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("RightDoor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 77.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.24F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.4F, KeyframeAnimations.degreeVec(0.0F, 7.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.52F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.68F, KeyframeAnimations.degreeVec(0.0F, 2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();

	public static final AnimationDefinition phone_booth_open = AnimationDefinition.Builder.withLength(1.001F)
			.addAnimation("phone", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 123.02F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 123.02F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition phone_booth_close = AnimationDefinition.Builder.withLength(0.5F)
			.addAnimation("phone", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 123.02F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.52F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition lamp_open = AnimationDefinition.Builder.withLength(0.68F)
			.addAnimation("lamplid", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.32F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 112.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.64F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 112.5F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition lamp_close = AnimationDefinition.Builder.withLength(0.7F)
			.addAnimation("lamplid", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 112.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.14F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.28F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.42F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.54F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.5F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(0.68F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();

	public static final AnimationDefinition phone_ring = AnimationDefinition.Builder.withLength(0.7492F).looping()
			.addAnimation("phone2", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.12F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.24F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.37F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.49F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.62F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition phone_dial = AnimationDefinition.Builder.withLength(3.5F)
			.addAnimation("button1", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.25F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("button2", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.39F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.64F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.76F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.89F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.01F, KeyframeAnimations.posVec(0.0F, 0.0F, -0.5F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.26F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition falling_start = AnimationDefinition.Builder.withLength(4.0064F)
			.addAnimation("TARDIF", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.2019F, KeyframeAnimations.degreeVec(-5.0429F, -7.4713F, 0.6574F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.4038F, KeyframeAnimations.degreeVec(-5.8752F, 5.4396F, 4.3908F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(4.0064F, KeyframeAnimations.degreeVec(4.8523F, -3.7228F, -4.5826F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("TARDIF", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.2019F, KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.4038F, KeyframeAnimations.posVec(0.0F, 10.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(4.0064F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AnimationDefinition falling_loop = AnimationDefinition.Builder.withLength(10.0F).looping()
			.addAnimation("TARDIF", new AnimationChannel(AnimationChannel.Targets.ROTATION,
					new Keyframe(0.0F, KeyframeAnimations.degreeVec(4.8523F, -3.7228F, -4.5826F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.0F, KeyframeAnimations.degreeVec(2.6179F, -10.7235F, 0.7792F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(4.0F, KeyframeAnimations.degreeVec(-3.3373F, -10.9103F, 5.8662F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(6.0F, KeyframeAnimations.degreeVec(-3.8532F, -0.799F, 0.3305F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(8.0F, KeyframeAnimations.degreeVec(1.3491F, -8.5713F, -0.5815F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(10.0F, KeyframeAnimations.degreeVec(4.8523F, -3.7228F, -4.5826F), AnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("TARDIF", new AnimationChannel(AnimationChannel.Targets.POSITION,
					new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 22.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(3.0F, KeyframeAnimations.posVec(0.0F, 22.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(5.0F, KeyframeAnimations.posVec(0.0F, 22.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(7.0F, KeyframeAnimations.posVec(0.0F, 22.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(9.0F, KeyframeAnimations.posVec(0.0F, 22.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
					new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
			))
	.build();
}

