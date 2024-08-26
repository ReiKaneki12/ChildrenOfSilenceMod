// Made with Blockbench 4.9.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhorizontal_slash<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "horizontal_slash"), "main");
	private final ModelPart horizontalslash;

	public Modelhorizontal_slash(ModelPart root) {
		this.horizontalslash = root.getChild("horizontalslash");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition horizontalslash = partdefinition.addOrReplaceChild(
				"horizontalslash", CubeListBuilder.create().texOffs(-1, 5).addBox(-12.0F, -0.5F, -5.0F, 24.0F, 1.0F,
						10.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(0.0F, 23.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		horizontalslash.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}