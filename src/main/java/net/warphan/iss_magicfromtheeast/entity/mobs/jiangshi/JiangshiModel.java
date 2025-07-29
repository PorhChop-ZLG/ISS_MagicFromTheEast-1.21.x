package net.warphan.iss_magicfromtheeast.entity.mobs.jiangshi;

import io.redspace.ironsspellbooks.IronsSpellbooks;
import net.minecraft.resources.ResourceLocation;
import net.warphan.iss_magicfromtheeast.ISS_MagicFromTheEast;
import software.bernie.geckolib.model.GeoModel;

public class JiangshiModel extends GeoModel<JiangshiEntity> {
    public static final ResourceLocation modelResource = new ResourceLocation(IronsSpellbooks.MODID, "geo/abstract_casting_mob.geo.json");
    public static final ResourceLocation textureResource = new ResourceLocation(ISS_MagicFromTheEast.MOD_ID, "textures/entity/jiangshi.png");
    public static final ResourceLocation animationResource = new ResourceLocation(ISS_MagicFromTheEast.MOD_ID, "animations/jiangshi.animation.json");

    @Override
    public ResourceLocation getModelResource(JiangshiEntity object) {
        return modelResource;
    }

    @Override
    public ResourceLocation getTextureResource(JiangshiEntity object) {
        return textureResource;
    }

    @Override
    public ResourceLocation getAnimationResource(JiangshiEntity animatable) {
        return animationResource;
    }
}
