// Made with Blockbench 4.9.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelslayer_helmet_boots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "slayer_helmet_boots"), "main");
	private final ModelPart bipedHead;
	private final ModelPart bipedLeftBoot;
	private final ModelPart bipedRightBoot;

	public Modelslayer_helmet_boots(ModelPart root) {
		this.bipedHead = root.getChild("bipedHead");
		this.bipedLeftBoot = root.getChild("bipedLeftBoot");
		this.bipedRightBoot = root.getChild("bipedRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("bipedHead", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead = bipedHead.addOrReplaceChild("armorHead",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.7F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.51F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hood = armorHead.addOrReplaceChild("hood",
				CubeListBuilder.create().texOffs(15, 58).addBox(-7.99F, -2.9398F, 0.0918F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.99F)),
				PartPose.offsetAndRotation(4.0F, -5.0F, 4.5F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bipedLeftBoot = partdefinition.addOrReplaceChild("bipedLeftBoot", CubeListBuilder.create()
				.texOffs(16, 48).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition bipedRightBoot = partdefinition.addOrReplaceChild("bipedRightBoot", CubeListBuilder.create()
				.texOffs(0, 48).addBox(-2.0F, 6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.8F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bipedHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightBoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bipedLeftBoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.bipedHead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bipedHead.xRot = headPitch / (180F / (float) Math.PI);
		this.bipedRightBoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}