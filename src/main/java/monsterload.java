import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class monsterload {
}

//추상 팩토리 패턴으로 진행
//interface Monster{} //몬스터 인터페이스 생성

abstract class Monster{
    //abstract Map<String, Object> LoadMonster() throws IOException, ParseException;
    public abstract String JsonDir();
}

/*
abstract class RaidMonster implements Monster{} //몬스터를 상속하고 레이드몬스터 추상 클래스 생성
abstract class MiniMonster implements Monster{} //몬스터를 상속하고 미니몬스터 추상 클래스 생성
abstract class BigMonster implements Monster{} //몬스터를 상속하고 빅몬스터 추상 클래스 생성
 */

class RaidMonsterFactory extends Monster{

    private String Dir;

    /*
        @Override
        Map<String, Object> LoadMonster() throws IOException, ParseException {
            JSONParser parser = new JSONParser();
            Reader reader = new FileReader("MonsterSetting/RaidMonsterSetting.json");
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            return jsonObject;
        }
        */
    @Override
    public String JsonDir() {
        return Dir = "MonsterSetting/RaidMonsterSetting.json";
    }
}

interface MonsterFactory {
    //Monster LoadMonster();
    Monster JsonDir();
}

class RaidMonster implements MonsterFactory {

    @Override
    public Monster JsonDir() {
        return new RaidMonsterFactory();
    }
}

class AbstractMonsterFactoryTest {
    decodingJson LoadJSon = new decodingJson();



    public void MosterPrint() throws IOException, ParseException {
        Map<String, String> MonsterData = new HashMap<String, String>();

        MonsterFactory monsterFactory = null;

        monsterFactory = new RaidMonster();
        Monster monster = monsterFactory.JsonDir();

        //monster.LoadMonster();
        String dir = monster.JsonDir();
        if(monster != null){
            MonsterData = LoadJSon.LoadJson(dir, "고블린킹", "MonsterData");
            Set<String> keys = MonsterData.keySet();

            for(String key: keys){
                System.out.println("몬스터 세팅값" + MonsterData.get(key));
            }
        }else{
            System.out.println("null!");
        }



    }
}