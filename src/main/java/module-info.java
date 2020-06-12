module eu.hansolo.fx.regulators {

    // Java
    requires java.base;
    requires java.logging;

    // Java-FX
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;

    // 3rd party
    requires transitive org.kordamp.iconli.core;
    requires transitive org.kordamp.ikonli.javafx;
    requires transitive org.kordamp.ikonli.fontawesome;
    requires transitive org.kordamp.ikonli.material;
    requires transitive org.kordamp.ikonli.materialdesign;
    requires transitive org.kordamp.ikonli.weathericons;

    exports eu.hansolo.fx.regulators;
}