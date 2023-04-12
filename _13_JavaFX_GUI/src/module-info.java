
module _13_JavaFX_GUI {
	requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires transitive javafx.media;
    
    exports examples;
    exports appBasicsFX; 
    exports appDemos; 
    exports layoutDemos;
    exports skratchPak;
    exports controls;
    exports mouseStuff;
	exports appGUI;
}