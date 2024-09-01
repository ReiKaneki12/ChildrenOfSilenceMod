// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelesck_demon_placeholder_normal_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "esck_demon_placeholder_normal_model"), "main");
	private final ModelPart root;
	private final ModelPart bottom;
	private final ModelPart bone16;
	private final ModelPart bone17;
	private final ModelPart left_leg;
	private final ModelPart bone18;
	private final ModelPart bone19;
	private final ModelPart left_lower_leg;
	private final ModelPart bone14;
	private final ModelPart bone6;
	private final ModelPart left_foot;
	private final ModelPart left_toe;
	private final ModelPart right_leg;
	private final ModelPart bone7;
	private final ModelPart bone8;
	private final ModelPart right_lower_leg;
	private final ModelPart bone9;
	private final ModelPart bone11;
	private final ModelPart right_foot;
	private final ModelPart right_toe;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart top;
	private final ModelPart bodytop;
	private final ModelPart chest;
	private final ModelPart right_chest;
	private final ModelPart right_chest3;
	private final ModelPart left_chest;
	private final ModelPart left_chest2;
	private final ModelPart bone21;
	private final ModelPart bone33;
	private final ModelPart bone2;
	private final ModelPart bone12;
	private final ModelPart ignore;
	private final ModelPart neck;
	private final ModelPart rotate5;
	private final ModelPart headrotate;
	private final ModelPart head;
	private final ModelPart right_eye_glow;
	private final ModelPart left_eye_glow;
	private final ModelPart righthornrotate;
	private final ModelPart righthorn1;
	private final ModelPart righthorn2;
	private final ModelPart lefthornrotate;
	private final ModelPart lefthorn3;
	private final ModelPart lefthorn4;
	private final ModelPart right_eye;
	private final ModelPart left_eye;
	private final ModelPart rotate;
	private final ModelPart rotate4;
	private final ModelPart rotate2;
	private final ModelPart jaw;
	private final ModelPart rotate3;
	private final ModelPart right_arm_pivot;
	private final ModelPart right_shoulder;
	private final ModelPart right_arm;
	private final ModelPart right_lower_arm;
	private final ModelPart right_muscle;
	private final ModelPart bone4;
	private final ModelPart right_hand;
	private final ModelPart right_thumb_part;
	private final ModelPart right_thumb;
	private final ModelPart bone5;
	private final ModelPart right_finger_part;
	private final ModelPart right_index_finger;
	private final ModelPart right_index_finger2;
	private final ModelPart right_index_finger3;
	private final ModelPart right_middle_finger;
	private final ModelPart right_middle_finger2;
	private final ModelPart right_middle_finger3;
	private final ModelPart right_pinky;
	private final ModelPart right_pinky2;
	private final ModelPart right_pinky3;
	private final ModelPart left_arm_pivot;
	private final ModelPart left_shoulder;
	private final ModelPart left_arm;
	private final ModelPart left_lower_arm;
	private final ModelPart left_muscle;
	private final ModelPart bone10;
	private final ModelPart left_hand;
	private final ModelPart left_thumb_part;
	private final ModelPart left_thumb;
	private final ModelPart bone3;
	private final ModelPart left_finger_part;
	private final ModelPart left_index_finger;
	private final ModelPart left_index_finger2;
	private final ModelPart left_index_finger3;
	private final ModelPart left_middle_finger;
	private final ModelPart left_middle_finger2;
	private final ModelPart left_middle_finger3;
	private final ModelPart left_pinky;
	private final ModelPart left_pinky2;
	private final ModelPart left_pinky3;

	public Modelesck_demon_placeholder_normal_model(ModelPart root) {
		this.root = root.getChild("root");
		this.bottom = root.getChild("bottom");
		this.bone16 = root.getChild("bone16");
		this.bone17 = root.getChild("bone17");
		this.left_leg = root.getChild("left_leg");
		this.bone18 = root.getChild("bone18");
		this.bone19 = root.getChild("bone19");
		this.left_lower_leg = root.getChild("left_lower_leg");
		this.bone14 = root.getChild("bone14");
		this.bone6 = root.getChild("bone6");
		this.left_foot = root.getChild("left_foot");
		this.left_toe = root.getChild("left_toe");
		this.right_leg = root.getChild("right_leg");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
		this.right_lower_leg = root.getChild("right_lower_leg");
		this.bone9 = root.getChild("bone9");
		this.bone11 = root.getChild("bone11");
		this.right_foot = root.getChild("right_foot");
		this.right_toe = root.getChild("right_toe");
		this.tail = root.getChild("tail");
		this.tail2 = root.getChild("tail2");
		this.tail3 = root.getChild("tail3");
		this.tail4 = root.getChild("tail4");
		this.tail5 = root.getChild("tail5");
		this.tail6 = root.getChild("tail6");
		this.top = root.getChild("top");
		this.bodytop = root.getChild("bodytop");
		this.chest = root.getChild("chest");
		this.right_chest = root.getChild("right_chest");
		this.right_chest3 = root.getChild("right_chest3");
		this.left_chest = root.getChild("left_chest");
		this.left_chest2 = root.getChild("left_chest2");
		this.bone21 = root.getChild("bone21");
		this.bone33 = root.getChild("bone33");
		this.bone2 = root.getChild("bone2");
		this.bone12 = root.getChild("bone12");
		this.ignore = root.getChild("ignore");
		this.neck = root.getChild("neck");
		this.rotate5 = root.getChild("rotate5");
		this.headrotate = root.getChild("headrotate");
		this.head = root.getChild("head");
		this.right_eye_glow = root.getChild("right_eye_glow");
		this.left_eye_glow = root.getChild("left_eye_glow");
		this.righthornrotate = root.getChild("righthornrotate");
		this.righthorn1 = root.getChild("righthorn1");
		this.righthorn2 = root.getChild("righthorn2");
		this.lefthornrotate = root.getChild("lefthornrotate");
		this.lefthorn3 = root.getChild("lefthorn3");
		this.lefthorn4 = root.getChild("lefthorn4");
		this.right_eye = root.getChild("right_eye");
		this.left_eye = root.getChild("left_eye");
		this.rotate = root.getChild("rotate");
		this.rotate4 = root.getChild("rotate4");
		this.rotate2 = root.getChild("rotate2");
		this.jaw = root.getChild("jaw");
		this.rotate3 = root.getChild("rotate3");
		this.right_arm_pivot = root.getChild("right_arm_pivot");
		this.right_shoulder = root.getChild("right_shoulder");
		this.right_arm = root.getChild("right_arm");
		this.right_lower_arm = root.getChild("right_lower_arm");
		this.right_muscle = root.getChild("right_muscle");
		this.bone4 = root.getChild("bone4");
		this.right_hand = root.getChild("right_hand");
		this.right_thumb_part = root.getChild("right_thumb_part");
		this.right_thumb = root.getChild("right_thumb");
		this.bone5 = root.getChild("bone5");
		this.right_finger_part = root.getChild("right_finger_part");
		this.right_index_finger = root.getChild("right_index_finger");
		this.right_index_finger2 = root.getChild("right_index_finger2");
		this.right_index_finger3 = root.getChild("right_index_finger3");
		this.right_middle_finger = root.getChild("right_middle_finger");
		this.right_middle_finger2 = root.getChild("right_middle_finger2");
		this.right_middle_finger3 = root.getChild("right_middle_finger3");
		this.right_pinky = root.getChild("right_pinky");
		this.right_pinky2 = root.getChild("right_pinky2");
		this.right_pinky3 = root.getChild("right_pinky3");
		this.left_arm_pivot = root.getChild("left_arm_pivot");
		this.left_shoulder = root.getChild("left_shoulder");
		this.left_arm = root.getChild("left_arm");
		this.left_lower_arm = root.getChild("left_lower_arm");
		this.left_muscle = root.getChild("left_muscle");
		this.bone10 = root.getChild("bone10");
		this.left_hand = root.getChild("left_hand");
		this.left_thumb_part = root.getChild("left_thumb_part");
		this.left_thumb = root.getChild("left_thumb");
		this.bone3 = root.getChild("bone3");
		this.left_finger_part = root.getChild("left_finger_part");
		this.left_index_finger = root.getChild("left_index_finger");
		this.left_index_finger2 = root.getChild("left_index_finger2");
		this.left_index_finger3 = root.getChild("left_index_finger3");
		this.left_middle_finger = root.getChild("left_middle_finger");
		this.left_middle_finger2 = root.getChild("left_middle_finger2");
		this.left_middle_finger3 = root.getChild("left_middle_finger3");
		this.left_pinky = root.getChild("left_pinky");
		this.left_pinky2 = root.getChild("left_pinky2");
		this.left_pinky3 = root.getChild("left_pinky3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.4F, 2.0F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition bottom = root.addOrReplaceChild("bottom",
				CubeListBuilder.create().texOffs(39, 44).addBox(-3.5F, -2.4F, 0.4F, 7.0F, 6.0F, 3.0F,
						new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(0.45F, -7.05F, 1.65F, -0.0436F, 0.0F, 0.0F));

		PartDefinition bone16 = bottom.addOrReplaceChild("bone16",
				CubeListBuilder.create().texOffs(25, 63).addBox(-1.1159F, -4.0788F, -0.6206F, 3.0F, 4.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 6.9F, -0.8F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone17 = bottom
				.addOrReplaceChild("bone17",
						CubeListBuilder.create().texOffs(0, 33).addBox(-3.5F, -2.5F, -0.8F, 7.0F, 3.0F, 2.0F,
								new CubeDeformation(0.25F)),
						PartPose.offsetAndRotation(0.0F, 7.1F, 2.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_leg = bottom.addOrReplaceChild("left_leg",
				CubeListBuilder.create().texOffs(20, 22).addBox(-4.0783F, -0.4304F, -1.6443F, 5.0F, 12.0F, 4.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-2.45F, 5.6014F, 1.224F, -0.6073F, 0.2546F, 0.164F));

		PartDefinition bone18 = left_leg.addOrReplaceChild("bone18",
				CubeListBuilder.create().texOffs(0, 66).addBox(0.378F, -3.7057F, -1.5001F, 1.0F, 7.0F, 3.0F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.2217F, 3.0696F, 0.8557F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone19 = left_leg.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(36, 53).mirror()
				.addBox(-4.0026F, -10.5996F, -0.7927F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offsetAndRotation(0.2217F, 11.2911F, -0.0125F, -0.2073F, -0.0668F, 0.1529F));

		PartDefinition left_lower_leg = left_leg.addOrReplaceChild("left_lower_leg",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5024F, -1.3823F, -10.7387F, 3.0F, 3.0F, 11.0F,
						new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(-3.1723F, 11.8883F, 0.1249F, -3.0582F, -0.0702F, 0.1106F));

		PartDefinition bone14 = left_lower_leg.addOrReplaceChild("bone14",
				CubeListBuilder.create().texOffs(28, 9).addBox(-0.5F, -1.8F, -1.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.9976F, -0.0823F, 0.1613F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone6 = left_lower_leg.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(36, 53).mirror()
						.addBox(-3.8103F, -9.3159F, -0.8278F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.25F))
						.mirror(false),
				PartPose.offsetAndRotation(2.394F, -1.2972F, -11.1374F, -1.9199F, 0.0F, 0.0F));

		PartDefinition left_foot = left_lower_leg.addOrReplaceChild("left_foot",
				CubeListBuilder.create().texOffs(0, 14).addBox(-0.5024F, -1.3823F, -8.7387F, 3.0F, 3.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, -1.309F, -0.0702F, 0.1106F));

		PartDefinition left_toe = left_foot.addOrReplaceChild("left_toe",
				CubeListBuilder.create().texOffs(17, 0).addBox(-1.4676F, 0.2004F, -6.2104F, 5.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -1.3044F, -0.1966F, 0.0761F));

		PartDefinition right_leg = bottom.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(20, 22).mirror()
						.addBox(-0.9217F, -0.4304F, -1.6443F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.5F))
						.mirror(false),
				PartPose.offsetAndRotation(2.35F, 5.6014F, 1.224F, -0.6073F, -0.2546F, -0.164F));

		PartDefinition bone7 = right_leg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 66).mirror()
				.addBox(-1.378F, -3.7057F, -1.5001F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(-0.2217F, 3.0696F, 0.8557F, 0.0F, 0.0F, -0.2182F));

		PartDefinition bone8 = right_leg.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(36, 53).addBox(0.0026F, -10.5996F, -0.7927F, 4.0F, 8.0F, 3.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(-0.2217F, 11.2911F, -0.0125F, -0.2073F, 0.0668F, -0.1529F));

		PartDefinition right_lower_leg = right_leg.addOrReplaceChild("right_lower_leg",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-2.4976F, -1.3823F, -10.7387F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.75F))
						.mirror(false),
				PartPose.offsetAndRotation(3.1723F, 11.8883F, 0.1249F, -3.0582F, 0.0702F, -0.1106F));

		PartDefinition bone9 = right_lower_leg.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(28, 9).mirror()
						.addBox(-0.5F, -1.8F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offsetAndRotation(-0.9976F, -0.0823F, 0.1613F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone11 = right_lower_leg.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(36, 53).addBox(-0.1897F, -9.3159F, -0.8278F, 4.0F, 8.0F, 3.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-2.394F, -1.2972F, -11.1374F, -1.9199F, 0.0F, 0.0F));

		PartDefinition right_foot = right_lower_leg.addOrReplaceChild("right_foot",
				CubeListBuilder.create().texOffs(0, 14).mirror()
						.addBox(-2.4976F, -1.3823F, -8.7387F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -10.0F, -1.309F, 0.0702F, -0.1106F));

		PartDefinition right_toe = right_foot.addOrReplaceChild("right_toe",
				CubeListBuilder.create().texOffs(17, 0).mirror()
						.addBox(-3.5324F, 0.2004F, -6.2104F, 5.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -8.0F, -1.3044F, 0.1966F, -0.0761F));

		PartDefinition tail = bottom.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 78)
						.addBox(-2.0F, -3.0F, -0.4F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.5F)).texOffs(0, 105)
						.addBox(0.0F, -6.0F, -0.9F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 4.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2",
				CubeListBuilder.create().texOffs(0, 78)
						.addBox(-2.0F, -3.0F, -0.4F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(0, 78)
						.addBox(-2.0F, -3.0F, 3.1F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3",
				CubeListBuilder.create().texOffs(0, 78)
						.addBox(-2.0F, -3.0F, 1.6F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 78)
						.addBox(-2.0F, -3.0F, -1.4F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3
				.addOrReplaceChild("tail4",
						CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, -1.3167F, -0.484F, 3.0F, 4.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5",
				CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, -2.0177F, -1.4019F, 3.0F, 4.0F, 7.0F,
						new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.4306F, 6.5775F, 0.3491F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6",
				CubeListBuilder.create().texOffs(0, 91).addBox(-1.5F, -2.3597F, -2.3416F, 3.0F, 4.0F, 7.0F,
						new CubeDeformation(-0.5F)),
				PartPose.offsetAndRotation(0.0F, -0.1704F, 5.9595F, 0.3491F, 0.0F, 0.0F));

		PartDefinition top = root.addOrReplaceChild("top", CubeListBuilder.create(),
				PartPose.offset(0.4F, -10.0F, 4.0F));

		PartDefinition bodytop = top.addOrReplaceChild("bodytop",
				CubeListBuilder.create().texOffs(35, 35)
						.addBox(-4.5F, -6.2704F, -1.1768F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.15F)).texOffs(0, 38)
						.addBox(-4.5F, -6.2704F, -1.1768F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.25F)).texOffs(15, 14)
						.addBox(-7.5F, -5.2704F, 0.8232F, 15.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.8076F, -0.1402F, 0.5672F, 0.0F, 0.0F));

		PartDefinition chest = bodytop.addOrReplaceChild("chest", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.5F, -3.2704F, 0.0232F, -0.1309F, 0.0F, 0.0F));

		PartDefinition right_chest = chest.addOrReplaceChild(
				"right_chest", CubeListBuilder.create().texOffs(0, 57).addBox(-1.4363F, -2.2934F, -2.0539F, 4.0F, 6.0F,
						3.0F, new CubeDeformation(1.5F)),
				PartPose.offsetAndRotation(-5.2F, 0.0F, 0.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition right_chest3 = right_chest.addOrReplaceChild("right_chest3",
				CubeListBuilder.create().texOffs(62, 53).addBox(-0.9587F, -2.4308F, -0.5192F, 4.0F, 6.0F, 2.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 1.0F, -0.1817F, 0.1481F, -0.705F));

		PartDefinition left_chest = chest.addOrReplaceChild("left_chest",
				CubeListBuilder.create().texOffs(0, 57).mirror()
						.addBox(-2.4584F, -2.2934F, -2.0556F, 4.0F, 6.0F, 3.0F, new CubeDeformation(1.5F))
						.mirror(false),
				PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition left_chest2 = left_chest.addOrReplaceChild("left_chest2",
				CubeListBuilder.create().texOffs(62, 53).mirror()
						.addBox(-3.0413F, -2.4308F, -0.5192F, 4.0F, 6.0F, 2.0F, new CubeDeformation(1.0F))
						.mirror(false),
				PartPose.offsetAndRotation(3.0F, -1.0F, 1.0F, -0.1817F, -0.1481F, 0.705F));

		PartDefinition bone21 = bodytop.addOrReplaceChild("bone21",
				CubeListBuilder.create().texOffs(68, 19).addBox(-1.828F, -2.5569F, -2.8248F, 5.0F, 2.0F, 1.0F,
						new CubeDeformation(0.75F)),
				PartPose.offsetAndRotation(-1.6646F, -6.6071F, 2.807F, -0.4863F, 0.1546F, -0.7794F));

		PartDefinition bone33 = bodytop.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(68, 19).mirror()
				.addBox(-3.172F, -2.5569F, -2.8248F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.75F)).mirror(false),
				PartPose.offsetAndRotation(1.5646F, -6.6071F, 2.807F, -0.4863F, -0.1546F, 0.7794F));

		PartDefinition bone2 = bodytop.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(65, 0).addBox(-2.7646F, -0.8367F, -3.2162F, 4.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.6F, -5.1704F, 2.5232F, -0.3949F, -0.1753F, -0.3969F));

		PartDefinition bone12 = bodytop.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(37, 64).addBox(-1.2354F, -0.8367F, -3.2162F, 4.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6F, -5.1704F, 2.5232F, -0.3949F, 0.1753F, 0.3969F));

		PartDefinition ignore = bodytop.addOrReplaceChild("ignore",
				CubeListBuilder.create().texOffs(0, 48)
						.addBox(-3.5F, 0.4985F, -0.7352F, 7.0F, 6.0F, 3.0F, new CubeDeformation(0.75F)).texOffs(0, 24)
						.addBox(0.0F, -0.5015F, 2.5148F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.3704F, 2.9232F, -0.4276F, 0.0F, 0.0F));

		PartDefinition neck = bodytop.addOrReplaceChild("neck",
				CubeListBuilder.create().texOffs(17, 40)
						.addBox(-2.0F, -3.7367F, -7.1782F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.15F)).texOffs(0, 26)
						.addBox(-3.0F, -0.7367F, -6.4782F, 6.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.1076F, -0.1598F, -1.1781F, 0.0F, 0.0F));

		PartDefinition rotate5 = neck.addOrReplaceChild("rotate5",
				CubeListBuilder.create().texOffs(34, 2)
						.addBox(-2.1F, -2.0F, -4.7F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-0.25F)).texOffs(38, 20)
						.addBox(-2.6F, -4.4F, 0.3F, 7.0F, 7.0F, 4.0F, new CubeDeformation(-0.25F)).texOffs(53, 10)
						.addBox(-2.6F, -2.4F, 3.8F, 5.0F, 5.0F, 3.0F, new CubeDeformation(-0.25F)).texOffs(60, 24)
						.addBox(-2.35F, -11.15F, 0.55F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(59, 46)
						.addBox(4.15F, -4.6283F, 0.5698F, 7.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 31)
						.addBox(4.15F, 2.3727F, 0.5708F, 5.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-2.349F, -9.15F, 0.55F, 0.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2633F, -2.2782F, -0.2519F, -0.2443F, -0.7543F));

		PartDefinition headrotate = neck.addOrReplaceChild("headrotate", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -1.9367F, -6.3782F, 0.7418F, 0.0F, 0.0F));

		PartDefinition head = headrotate.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(68, 33)
						.addBox(-0.8F, -0.9F, -5.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(0, 15)
						.addBox(0.2F, -3.9F, -5.0F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 69)
						.addBox(-0.8F, -0.7F, -2.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 14)
						.addBox(-0.8F, 0.1F, -5.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.2F, 0.0F, -1.0F));

		PartDefinition right_eye_glow = head.addOrReplaceChild("right_eye_glow",
				CubeListBuilder.create().texOffs(22, 91)
						.addBox(0.025F, -2.7F, -2.75F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 89)
						.addBox(-2.225F, -2.7F, 0.0F, 5.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.875F, -1.6633F, -1.0968F));

		PartDefinition left_eye_glow = head.addOrReplaceChild("left_eye_glow",
				CubeListBuilder.create().texOffs(22, 89).mirror()
						.addBox(-2.75F, -2.725F, 0.025F, 5.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(22, 91).mirror()
						.addBox(0.0F, -2.725F, -2.725F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.15F, -1.6383F, -1.4218F));

		PartDefinition righthornrotate = head.addOrReplaceChild("righthornrotate", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1F, 7.0F, -1.7F, 0.0F, 0.8727F, 0.0F));

		PartDefinition righthorn1 = righthornrotate.addOrReplaceChild("righthorn1",
				CubeListBuilder.create().texOffs(11, 63)
						.addBox(-4.0F, -2.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(66, 61)
						.addBox(-9.0F, -3.5F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.55F, -8.5F, 0.8F, 0.0F, 0.0F, 0.4363F));

		PartDefinition righthorn2 = righthorn1.addOrReplaceChild("righthorn2",
				CubeListBuilder.create().texOffs(11, 63).addBox(-4.0F, -2.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.1F, 0.0F, 0.1745F, 0.4363F));

		PartDefinition lefthornrotate = head.addOrReplaceChild("lefthornrotate", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.5F, 7.0F, -1.7F, 0.0F, -0.8727F, 0.0F));

		PartDefinition lefthorn3 = lefthornrotate.addOrReplaceChild("lefthorn3",
				CubeListBuilder.create().texOffs(11, 63).mirror()
						.addBox(0.0F, -2.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(66, 61).mirror()
						.addBox(5.0F, -3.5F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.55F, -8.5F, 0.8F, 0.0F, 0.0F, -0.4363F));

		PartDefinition lefthorn4 = lefthorn3.addOrReplaceChild("lefthorn4",
				CubeListBuilder.create().texOffs(11, 63).mirror()
						.addBox(0.0F, -2.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.1F, 0.0F, -0.1745F, -0.4363F));

		PartDefinition right_eye = head.addOrReplaceChild("right_eye",
				CubeListBuilder.create().texOffs(17, 9).addBox(-1.458F, 0.1451F, -2.4987F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.2F, -2.8F, -0.3F, 0.4387F, 0.7783F, 0.7762F));

		PartDefinition left_eye = head.addOrReplaceChild("left_eye",
				CubeListBuilder.create().texOffs(17, 9).addBox(-1.5421F, 0.0451F, -2.2987F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.6F, -2.8F, -0.3F, 0.4387F, -0.7783F, -0.7762F));

		PartDefinition rotate = head.addOrReplaceChild("rotate",
				CubeListBuilder.create().texOffs(56, 40)
						.addBox(-4.05F, 1.0F, -0.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 18)
						.addBox(-4.05F, -1.0F, -0.2F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.15F)).texOffs(17, 0)
						.addBox(-0.05F, -1.0F, 3.8F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
						.addBox(-7.05F, -1.0F, -0.2F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(67, 66)
						.addBox(-1.6707F, -1.0F, -1.7707F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -1.0F, -2.5F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rotate4 = rotate.addOrReplaceChild("rotate4",
				CubeListBuilder.create().texOffs(11, 57).addBox(-1.071F, -0.3F, -1.2704F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.7F, -0.7F, -0.8F, 0.0869F, -0.0076F, 0.0869F));

		PartDefinition rotate2 = rotate.addOrReplaceChild("rotate2",
				CubeListBuilder.create().texOffs(56, 31).addBox(-2.3F, -1.2766F, -2.0357F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2F, -0.8F, 1.2F, 0.3491F, 0.0F, 0.3491F));

		PartDefinition jaw = headrotate.addOrReplaceChild("jaw",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(0.0F, 0.0F, -7.8F, 0.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 25)
						.addBox(0.0F, 0.0F, -2.8F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rotate3 = jaw.addOrReplaceChild("rotate3", CubeListBuilder.create().texOffs(32, 44)
				.addBox(-0.585F, -0.4541F, -1.8565F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 20)
				.addBox(-0.585F, -1.2031F, -1.8565F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).texOffs(48, 66)
				.addBox(-2.585F, -0.453F, -0.8565F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 38)
				.addBox(-2.585F, -1.453F, -0.8565F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, 0.0F, -3.5F, 0.0F, 0.7854F, 0.0F));

		PartDefinition right_arm_pivot = top.addOrReplaceChild("right_arm_pivot", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -4.0F, -2.0F));

		PartDefinition right_shoulder = right_arm_pivot.addOrReplaceChild("right_shoulder",
				CubeListBuilder.create().texOffs(49, 0).mirror()
						.addBox(-2.3242F, -1.4768F, -2.3266F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.4341F, -1.5477F, 0.9762F, 0.363F, 0.5641F, 0.5529F));

		PartDefinition right_arm = right_shoulder.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(20, 51).mirror()
						.addBox(-2.5379F, -0.9816F, -2.1061F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.25F))
						.mirror(false),
				PartPose.offsetAndRotation(0.329F, 4.0919F, -0.3666F, -0.1767F, -0.734F, 0.2499F));

		PartDefinition right_lower_arm = right_arm.addOrReplaceChild("right_lower_arm",
				CubeListBuilder.create().texOffs(50, 53).mirror()
						.addBox(-0.7091F, 0.3089F, -3.1105F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.5F)).mirror(false),
				PartPose.offsetAndRotation(-2.1288F, 7.1945F, 1.5184F, -0.829F, 0.0F, 0.0F));

		PartDefinition right_muscle = right_lower_arm.addOrReplaceChild("right_muscle",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.5F, -4.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2909F, 4.3089F, -2.3105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone4 = right_lower_arm.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(32, 51).mirror()
						.addBox(9.653F, 22.4811F, 1.7489F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)).mirror(false)
						.texOffs(34, 0).mirror()
						.addBox(9.253F, 24.4811F, 2.3489F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.8621F, -23.2105F, 2.688F, -0.2182F, 0.0F, 0.0F));

		PartDefinition right_hand = right_lower_arm.addOrReplaceChild("right_hand",
				CubeListBuilder.create().texOffs(58, 61).mirror()
						.addBox(-0.4118F, 1.4546F, -2.3985F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(66, 5).mirror()
						.addBox(-1.4118F, -0.5454F, -1.3985F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.5379F, 7.7895F, -2.412F, 0.0F, 0.0F, 0.1745F));

		PartDefinition right_thumb_part = right_hand.addOrReplaceChild("right_thumb_part",
				CubeListBuilder.create().texOffs(35, 69).mirror()
						.addBox(-0.9171F, -1.2342F, -1.682F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2053F, 2.6555F, -1.2F, -0.6545F, 0.0F, 0.0F));

		PartDefinition right_thumb = right_thumb_part.addOrReplaceChild("right_thumb",
				CubeListBuilder.create().texOffs(18, 69).mirror()
						.addBox(13.0829F, -2.0734F, 20.759F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F))
						.mirror(false).texOffs(34, 20).mirror()
						.addBox(13.0829F, -1.0734F, 22.259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
						.mirror(false),
				PartPose.offsetAndRotation(-14.3F, -17.2713F, -11.906F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone5 = right_thumb.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(8, 69).mirror()
				.addBox(13.0829F, -14.516F, 16.0266F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.6804F, 1.9686F, -0.5847F, 0.0F, 0.0F));

		PartDefinition right_finger_part = right_hand.addOrReplaceChild("right_finger_part",
				CubeListBuilder.create().texOffs(45, 14).mirror()
						.addBox(-0.2692F, -0.301F, -1.8321F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.1947F, 5.5555F, -0.7F, 0.0F, 0.1309F, 0.0F));

		PartDefinition right_index_finger = right_finger_part.addOrReplaceChild("right_index_finger",
				CubeListBuilder.create().texOffs(49, 0).mirror()
						.addBox(-0.6245F, 0.199F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offset(0.9553F, 0.1F, -1.0923F));

		PartDefinition right_index_finger2 = right_index_finger.addOrReplaceChild("right_index_finger2",
				CubeListBuilder.create().texOffs(45, 13).mirror()
						.addBox(0.0671F, 0.1416F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.151F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.7F, 2.3F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition right_index_finger3 = right_index_finger2.addOrReplaceChild("right_index_finger3",
				CubeListBuilder.create().texOffs(7, 0).mirror()
						.addBox(3.6634F, 26.3042F, -1.0398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(11.3277F, -22.6884F, 0.5F, 0.0F, 0.0F, 0.5585F));

		PartDefinition right_middle_finger = right_finger_part.addOrReplaceChild("right_middle_finger",
				CubeListBuilder.create().texOffs(49, 0).mirror()
						.addBox(-0.6245F, 0.199F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(0.9553F, 0.4F, 0.5077F, 0.1309F, 0.0F, 0.0F));

		PartDefinition right_middle_finger2 = right_middle_finger.addOrReplaceChild("right_middle_finger2",
				CubeListBuilder.create().texOffs(45, 13).mirror()
						.addBox(0.0671F, 0.1417F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.151F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.7F, 2.3F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition right_middle_finger3 = right_middle_finger2.addOrReplaceChild("right_middle_finger3",
				CubeListBuilder.create().texOffs(7, 0).mirror()
						.addBox(3.6634F, 26.3042F, -1.0398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(11.3277F, -22.6884F, 0.5F, 0.0F, 0.0F, 0.5585F));

		PartDefinition right_pinky = right_finger_part.addOrReplaceChild("right_pinky",
				CubeListBuilder.create().texOffs(49, 0).mirror()
						.addBox(-0.6245F, 0.199F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false),
				PartPose.offsetAndRotation(0.9553F, -0.6F, 1.8077F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_pinky2 = right_pinky.addOrReplaceChild("right_pinky2",
				CubeListBuilder.create().texOffs(45, 13).mirror()
						.addBox(0.0671F, 0.1417F, -0.5398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.151F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.7F, 2.3F, 0.0F, 0.0F, 0.0F, -0.9599F));

		PartDefinition right_pinky3 = right_pinky2.addOrReplaceChild("right_pinky3",
				CubeListBuilder.create().texOffs(7, 0).mirror()
						.addBox(3.6634F, 26.3042F, -1.0398F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false),
				PartPose.offsetAndRotation(11.3277F, -22.6884F, 0.5F, 0.0F, 0.0F, 0.5585F));

		PartDefinition left_arm_pivot = top.addOrReplaceChild("left_arm_pivot", CubeListBuilder.create(),
				PartPose.offset(7.0F, -4.0F, -2.0F));

		PartDefinition left_shoulder = left_arm_pivot.addOrReplaceChild("left_shoulder",
				CubeListBuilder.create().texOffs(49, 0).addBox(-1.6758F, -1.4768F, -2.3266F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(0.4341F, -1.5477F, 0.9762F, 0.363F, -0.5641F, -0.5529F));

		PartDefinition left_arm = left_shoulder.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(20, 51).addBox(-1.4621F, -0.9816F, -2.1061F, 4.0F, 8.0F, 4.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.329F, 4.0919F, -0.3666F, -0.1767F, 0.734F, -0.2499F));

		PartDefinition left_lower_arm = left_arm.addOrReplaceChild("left_lower_arm",
				CubeListBuilder.create().texOffs(50, 53).addBox(-2.2909F, 0.3089F, -3.1105F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(2.1288F, 7.1945F, 1.5184F, -0.829F, 0.0F, 0.0F));

		PartDefinition left_muscle = left_lower_arm.addOrReplaceChild("left_muscle",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -4.0F, -1.5F, 2.0F, 6.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2909F, 4.3089F, -2.3105F, 0.3054F, 0.0F, 0.0F));

		PartDefinition bone10 = left_lower_arm.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(32, 51)
				.addBox(-10.653F, 22.4811F, 1.7489F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.25F)).texOffs(34, 0)
				.addBox(-11.253F, 24.4811F, 2.3489F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.8621F, -23.2105F, 2.688F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left_hand = left_lower_arm.addOrReplaceChild("left_hand",
				CubeListBuilder.create().texOffs(58, 61)
						.addBox(-1.5882F, 1.4546F, -2.3985F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 5)
						.addBox(-2.5882F, -0.5454F, -1.3985F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5379F, 7.7895F, -2.412F, 0.0F, 0.0F, -0.1745F));

		PartDefinition left_thumb_part = left_hand.addOrReplaceChild("left_thumb_part",
				CubeListBuilder.create().texOffs(35, 69).addBox(-1.0829F, -1.2342F, -1.682F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2053F, 2.6555F, -1.2F, -0.6545F, 0.0F, 0.0F));

		PartDefinition left_thumb = left_thumb_part.addOrReplaceChild("left_thumb", CubeListBuilder.create()
				.texOffs(18, 69).addBox(-15.0829F, -2.0734F, 20.759F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(34, 20).addBox(-15.0829F, -1.0734F, 22.259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
				PartPose.offsetAndRotation(14.3F, -17.2713F, -11.906F, -1.0908F, 0.0F, 0.0F));

		PartDefinition bone3 = left_thumb.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(8, 69).addBox(-15.0829F, -14.516F, 16.0266F, 2.0F, 2.0F, 3.0F,
						new CubeDeformation(-0.2F)),
				PartPose.offsetAndRotation(0.0F, 1.6804F, 1.9686F, -0.5847F, 0.0F, 0.0F));

		PartDefinition left_finger_part = left_hand.addOrReplaceChild("left_finger_part",
				CubeListBuilder.create().texOffs(45, 14).addBox(-1.7308F, -0.301F, -1.8321F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(-0.15F)),
				PartPose.offsetAndRotation(0.1947F, 5.5555F, -0.7F, 0.0F, -0.1309F, 0.0F));

		PartDefinition left_index_finger = left_finger_part
				.addOrReplaceChild(
						"left_index_finger", CubeListBuilder.create().texOffs(49, 0).addBox(-0.3755F, 0.199F, -0.5398F,
								1.0F, 2.0F, 1.0F, new CubeDeformation(0.15F)),
						PartPose.offset(-0.9553F, 0.1F, -1.0923F));

		PartDefinition left_index_finger2 = left_index_finger.addOrReplaceChild("left_index_finger2",
				CubeListBuilder.create().texOffs(45, 13).addBox(-1.0671F, 0.1416F, -0.5398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.151F)),
				PartPose.offsetAndRotation(0.7F, 2.3F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition left_index_finger3 = left_index_finger2.addOrReplaceChild("left_index_finger3",
				CubeListBuilder.create().texOffs(7, 0).addBox(-4.6634F, 26.3042F, -1.0398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-11.3277F, -22.6884F, 0.5F, 0.0F, 0.0F, -0.5585F));

		PartDefinition left_middle_finger = left_finger_part.addOrReplaceChild("left_middle_finger",
				CubeListBuilder.create().texOffs(49, 0).addBox(-0.3755F, 0.199F, -0.5398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-0.9553F, 0.4F, 0.5077F, 0.1309F, 0.0F, 0.0F));

		PartDefinition left_middle_finger2 = left_middle_finger.addOrReplaceChild("left_middle_finger2",
				CubeListBuilder.create().texOffs(45, 13).addBox(-1.0671F, 0.1417F, -0.5398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.151F)),
				PartPose.offsetAndRotation(0.7F, 2.3F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition left_middle_finger3 = left_middle_finger2.addOrReplaceChild("left_middle_finger3",
				CubeListBuilder.create().texOffs(7, 0).addBox(-4.6634F, 26.3042F, -1.0398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-11.3277F, -22.6884F, 0.5F, 0.0F, 0.0F, -0.5585F));

		PartDefinition left_pinky = left_finger_part.addOrReplaceChild("left_pinky",
				CubeListBuilder.create().texOffs(49, 0).addBox(-0.3755F, 0.199F, -0.5398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(-0.9553F, -0.6F, 1.8077F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_pinky2 = left_pinky.addOrReplaceChild("left_pinky2",
				CubeListBuilder.create().texOffs(45, 13).addBox(-1.0671F, 0.1417F, -0.5398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.151F)),
				PartPose.offsetAndRotation(0.7F, 2.3F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition left_pinky3 = left_pinky2.addOrReplaceChild("left_pinky3",
				CubeListBuilder.create().texOffs(7, 0).addBox(-4.6634F, 26.3042F, -1.0398F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(-11.3277F, -22.6884F, 0.5F, 0.0F, 0.0F, -0.5585F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_arm_pivot.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_arm_pivot.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}