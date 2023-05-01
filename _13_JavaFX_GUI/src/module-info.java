
module _13_JavaFX_GUI {
	requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires transitive javafx.media;
    
    exports examples_border_grid_box;
    exports appBasicsFX; 
    exports appDemos_textbook_code; 
    exports layoutDemos;
    exports skratchPak;
    exports controls_button_radio_check;
    exports mouseStuff;
	exports app_hello_GUI;
	exports animations_demo;
}