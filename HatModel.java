
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.io.File;
import java.io.FileNotFoundException;


public class HatModel   extends ModelBiped
{
  public static ModelRenderer model;


  public HatModel() {
    model = (new ModelRenderer(this)).setTextureSize(64, 128);
    model.setRotationPoint(-5.0F, -10.03125F, -5.0F);
    model.setTextureOffset(0, 64).addBox(-5.0F, -10.0F, -5.0F, 10, 2, 10);
    ModelRenderer modelrenderer = (new ModelRenderer(this)).setTextureSize(64, 128);
    modelrenderer.setRotationPoint(1.75F, -4.0F, 2.0F);
    modelrenderer.setTextureOffset(0, 76).addBox(-5.0F, -9.0F, -5.0F, 7, 4, 7);
    modelrenderer.rotateAngleX = -0.05235988F;
    modelrenderer.rotateAngleZ = 0.02617994F;
    model.addChild(modelrenderer);
    ModelRenderer modelrenderer1 = (new ModelRenderer(this)).setTextureSize(64, 128);
    modelrenderer1.setRotationPoint(1.75F, -4.0F, 2.0F);
    modelrenderer1.setTextureOffset(0, 87).addBox(-5.0F, -8.0F, -5.0F, 4, 4, 4);
    modelrenderer1.rotateAngleX = -0.10471976F;
    modelrenderer1.rotateAngleZ = 0.05235988F;
    modelrenderer.addChild(modelrenderer1);
    ModelRenderer modelrenderer2 = (new ModelRenderer(this)).setTextureSize(64, 128);
    modelrenderer2.setRotationPoint(1.75F, -2.0F, 2.0F);
    modelrenderer2.setTextureOffset(0, 95).addBox(-6.0F, -7.0F, -5.0F, 1, 2, 1, 0.25F);
    modelrenderer2.rotateAngleX = -0.20943952F;
    modelrenderer2.rotateAngleZ = 0.10471976F;
    modelrenderer1.addChild(modelrenderer2);
  }

  public void render(Entity entityIn, ModelRenderer source, float scale) {
    if (entityIn.isSneaking()) {
      GlStateManager.translate(0.0D, 0.2D, 0.0D);
    }
    copyModelAngles(source, model);
    GlStateManager.pushMatrix();
    model.render(scale);
    GlStateManager.popMatrix();

  }
}