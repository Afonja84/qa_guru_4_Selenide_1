import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void drugAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        sleep(3000); //увидеть что было
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        sleep(3000); //увидеть что стало
    }
}
