package net.lawaxi.serverbase;

import net.fabricmc.api.ModInitializer;

public class Serverbase implements ModInitializer {


    @Override
    public void onInitialize() {

        // 只要 Minecraft 处于mod-load-ready 该代码就会运行
        // 但是 有些东西（如资源）可能仍然未初始化

        System.out.println("注册 LawaxiServerBase");
    }
}
