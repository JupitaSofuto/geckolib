package software.bernie.geckolib3.core.molang;

final class Dummy {
    static final String ANIMATION_FILE = "geckolib3:dummy";
    static final String ANIMATION_NAME = "dummy";
    static final String BONE_NAME = "dummy";

    static String onParseFailureExpression(String expression, String animationFile, String animationName, String boneName, int axis, Exception e) {
        throw new UnsupportedOperationException();
    }
}
