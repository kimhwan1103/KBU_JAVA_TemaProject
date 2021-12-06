import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import org.json.simple.parser.ParseException;


//추상 팩토리 패턴으로 진행

abstract class Monster{
    public abstract String JsonDir();
}

class RaidMonsterFactory extends Monster{

    private String Dir;

    @Override
    public String JsonDir() {
        return Dir = "MonsterSetting/RaidMonsterSetting.json";
    }
}

interface MonsterFactory {
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


            System.out.println(MonsterData.entrySet());

        }else{
            System.out.println("null!");
        }



    }
}