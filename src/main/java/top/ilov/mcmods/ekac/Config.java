package top.ilov.mcmods.ekac;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import dev.isxander.yacl3.config.ConfigEntry;
import dev.isxander.yacl3.config.ConfigInstance;
import dev.isxander.yacl3.config.GsonConfigInstance;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class Config {

    public static final ConfigInstance<Config> config = GsonConfigInstance.createBuilder(Config.class)
            .setPath(FabricLoader.getInstance().getConfigDir().resolve("ekac-fabric-config.json")).build();


    @ConfigEntry public boolean checkForUpdate = true;

    public static Screen createConfigScreen(Screen screen) {
        return YetAnotherConfigLib.create(config, (defaults, config1, builder) -> builder
                .title(Text.translatable("config.ekac.title"))
                .category(ConfigCategory.createBuilder()
                        .name(Text.translatable("config.ekac.category"))
                        .option(Option.<Boolean>createBuilder()
                                .name(Text.translatable("config.ekac.enable-check-update"))
                                .binding(
                                        defaults.checkForUpdate,
                                        () -> config1.checkForUpdate,
                                        val -> config1.checkForUpdate = val
                                )
                                .controller(BooleanControllerBuilder::create)
                                .build())
                        .build()))
                .generateScreen(screen);

    }

}
