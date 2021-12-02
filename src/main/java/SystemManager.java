import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SystemManager {
    public static void main(String args[]) throws IOException, ParseException {
        ConsolePrintControl.PageControl();
    }
}

class PlayerSetting {
    private JSONObject jsonoBject = new JSONObject();

}

class ConsolePrint {
    public void MenuPage() {
        System.out.println("게임 이름");
        System.out.println("1. 새로 시작");
        System.out.println("2. 불러오기");
        System.out.println("3. 종료");
    }

    public void SelectJob() {
        System.out.println("직업을 선택하세요");
    }
    public void LoadGame() {
        System.out.println("저장된 게임을 불러옵니다");
    }

    public void ExitGame(){
        System.out.println("게임을 종료합니다");
        System.exit(0);
    }

    public void Error() {
        System.out.println("에러!");
    }

    public void TestPrint() throws IOException, ParseException {
        System.out.println("테스트 페이지");

        AbstractMonsterFactoryTest abstractMonsterFactoryTest = new AbstractMonsterFactoryTest();

        abstractMonsterFactoryTest.MosterPrint();
    }
}

class ConsolePrintControl extends ConsolePrint {
    public static void PageControl() throws IOException, ParseException {

        ConsolePrint ConsoleOut = new ConsolePrint();

        Scanner sc = new Scanner(System.in);
        int ChoiceNum;

        ConsoleOut.MenuPage();

        ChoiceNum = sc.nextInt();

        switch (ChoiceNum) {
            case 1 : ConsoleOut.SelectJob();
            break;
            case 2 : ConsoleOut.LoadGame();
            break;
            case 3: ConsoleOut.ExitGame();
            break;
            case 4: ConsoleOut.TestPrint();
            break;
            default: ConsoleOut.Error();
        }
    }
}

