package manmaed.cutepuppymod.client.render.entity;

import manmaed.cutepuppymod.libs.Textures;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Field;

/**
 * Created by manmaed on 01/07/2018.
 */



public class RenderPuppyTextures {

    private static boolean manmaed = false;
    private static boolean joe = false;
    private static boolean beefs = false;
    private static boolean dire = false;
    private static boolean halloween = false;
    private static boolean christmas = false;

    public void sethat(String fieldName)
            throws NoSuchFieldException, IllegalAccessException {
        Field field = getClass().getDeclaredField(fieldName);
        field.setBoolean(this, true);
    }

    public static ResourceLocation BluePuppy() {
        if (manmaed) {
            return Textures.MODEL_BLUE_PUPPY_BDAY;
        }
        if (beefs) {
            return Textures.MODEL_BLUE_PUPPY_BDAY;
        }
        if (halloween) {
            return Textures.MODEL_BLUE_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_BLUE_PUPPY_XMAS;
        } else {
            return Textures.MODEL_BLUE_PUPPY;
        }
    } //Done

    public static ResourceLocation RedPuppy() {
        if (manmaed) {
            return Textures.MODEL_RED_PUPPY_BDAY;
        }
        /*if () {
            return Textures.MODEL_RED_PUPPY_BDAY;
        }*/
        if (halloween) {
            return Textures.MODEL_RED_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_RED_PUPPY_XMAS;
        } else {
            return Textures.MODEL_RED_PUPPY;
        }
    } //Done

    public static ResourceLocation YellowPuppy() {
        if (manmaed) {
            return Textures.MODEL_YELLOW_PUPPY_BDAY;
        }
        /*if () {
            return Textures.MODEL_YELLOW_PUPPY_BDAY;
        }*/
        if (halloween) {
            return Textures.MODEL_YELLOW_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_YELLOW_PUPPY_XMAS;
        } else {
            return Textures.MODEL_YELLOW_PUPPY;
        }
    } //Done

    public static ResourceLocation GreenPuppy() {
        if (manmaed) {
            return Textures.MODEL_GREEN_PUPPY_BDAY;
        }
        /*if () {
            return Textures.MODEL_GREEN_PUPPY_BDAY;
        }*/
        if (halloween) {
            return Textures.MODEL_GREEN_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_GREEN_PUPPY_XMAS;
        } else {
            return Textures.MODEL_GREEN_PUPPY;
        }
    } //Done

    public static ResourceLocation PurplePuppy() {
        if (manmaed) {
            return Textures.MODEL_PURPLE_PUPPY_BDAY;
        }
        /*if () {
            return Textures.MODEL_PURPLE_PUPPY_BDAY;
        }*/
        if (halloween) {
            return Textures.MODEL_PURPLE_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_PURPLE_PUPPY_XMAS;
        } else {
            return Textures.MODEL_PURPLE_PUPPY;
        }
    } //Done

    public static ResourceLocation StevePuppy() {
        if (manmaed) {
            return Textures.MODEL_STEVE_PUPPY_BDAY;
        }
        if (dire) {
            return Textures.MODEL_STEVE_PUPPY_BDAY;
        }
        if (halloween) {
            return Textures.MODEL_STEVE_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_STEVE_PUPPY_XMAS;
        } else {
            return Textures.MODEL_STEVE_PUPPY;
        }
    } //Done

    public static ResourceLocation HerobrinePuppy() {
        if (manmaed) {
            return Textures.MODEL_HEROBRINE_PUPPY_BDAY;
        }
        if (dire) {
            return Textures.MODEL_HEROBRINE_PUPPY_BDAY;
        }
        if (halloween) {
            return Textures.MODEL_HEROBRINE_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_HEROBRINE_PUPPY_XMAS;
        } else {
            return Textures.MODEL_HEROBRINE_PUPPY;
        }
    } //Done

    public static ResourceLocation EnderPuppy() {
        if (manmaed) {
            return Textures.MODEL_ENDER_PUPPY_BDAY;
        }
        if (beefs) {
            return Textures.MODEL_ENDER_PUPPY_BDAY;
        }
        if (halloween) {
            return Textures.MODEL_ENDER_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_ENDER_PUPPY_XMAS;
        } else {
            return Textures.MODEL_ENDER_PUPPY;
        }
    } //Done

    public static ResourceLocation EnderBossPuppy() {
        if (manmaed) {
            return Textures.MODEL_ENDER_PUPPY_BDAY;
        }
        /*if () {
            return Textures.MODEL_ENDER_PUPPY_BDAY;
        }*/
        if (halloween) {
            return Textures.MODEL_ENDER_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_ENDER_PUPPY_XMAS;
        } else {
            return Textures.MODEL_ENDER_PUPPY;
        }
    } //Done

    public static ResourceLocation SixPuppy() {
        /*if (manmaed) {
            return Textures.MODEL_SIX_PUPPY_BDAY;
        }*/
        /*if () {
            return Textures.MODEL_SIX_PUPPY_BDAY;
        }*/
        /*if (halloween) {
            return Textures.MODEL_SIX_PUPPY_HALLOWEEN;
        }*/
        if (christmas) {
            return Textures.MODEL_SIX_PUPPY_XMAS;
        } else {
            return Textures.MODEL_SIX_PUPPY;
        }
    } //Done

    public static ResourceLocation TheBossPuppy() {
        /*if (manmaed) {
            return Textures.MODEL_PURPLE_PUPPY_BDAY;
        }*/
        /*if () {
            return Textures.MODEL_PURPLE_PUPPY_BDAY;
        }*/
        /*if (halloween) {
            return Textures.MODEL_PURPLE_PUPPY_HALLOWEEN;
        }
        if (christmas) {
            return Textures.MODEL_PURPLE_PUPPY_XMAS;
        } else {*/
            return Textures.MODEL_BOSS_PUPPY;
        /*}*/
    } //Done
}
