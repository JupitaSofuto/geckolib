package software.bernie.geckolib3.util.json;

import com.google.gson.JsonElement;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;

final class Dummy {
    static final ResourceLocation ANIMATION_FILE = new ResourceLocation(GeckoLib.ModID, "dummy");
    static final String ANIMATION_NAME = "dummy";
    static final String BONE_NAME = "dummy";

    static double onParseFailureDouble(JsonElement element, ResourceLocation animationFile, String animationName, String boneName, int axis, UnsupportedOperationException e) {
        throw new UnsupportedOperationException();
    }
}
