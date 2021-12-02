import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class decodingJson {
    public Map<String, String> LoadJson(String Dir, String SelectItem, String SelectMod) throws IOException, ParseException {
        Map<String, String> data = new HashMap<String, String>();

        JSONParser parser = new JSONParser();
        Reader reader = new FileReader(Dir);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        if(SelectMod == "MonsterData"){
            System.out.println(SelectItem);
            JSONArray arr = (JSONArray)jsonObject.get(SelectItem);
            /*
            JSONObject monster = (JSONObject) jsonObject
            //JSONArray arr = (JSONArray)jsonObject.get(SelectItem);


            String HP = (String)monster.get("HP");
            String XP = (String)monster.get("Xp");
            String DefensivePower = (String)monster.get("DefensivePower");
            String damage = (String)monster.get("damage");
            String speech = (String)monster.get("speech");

            data.put("HP", HP);
            data.put("XP", XP);
            data.put("DefensivePower", DefensivePower);
            data.put("damage", damage);
            data.put("speech", speech);

            for(int i =0; i<1; i++){
                JSONObject MonsterSkill = (JSONObject) parser.parse(Integer.toString(i));
                String SkillName = (String)MonsterSkill.get("SkillName");
                String SkillDamage = (String)MonsterSkill.get("damage");
                String SkillSpeech = (String)MonsterSkill.get("SkillSpeech");

                data.put("SkillName", SkillName);
                data.put(SkillName+"Damage", SkillDamage);
                data.put(SkillName+"Speech", SkillSpeech);
            }

             */
            System.out.println(arr.size());
            for(int i=0; i<arr.size(); i++){
                JSONObject tmp = (JSONObject)arr.get(i);

                String HP = (String)tmp.get("HP");
                String XP = (String)tmp.get("Xp");
                String DefensivePower = (String)tmp.get("DefensivePower");
                String damage = (String)tmp.get("damage");
                String speech = (String)tmp.get("speech");

                data.put("HP", HP);
                data.put("XP", XP);
                data.put("DefensivePower", DefensivePower);
                data.put("damage", damage);
                data.put("speech", speech);
                JSONArray arr2 = (JSONArray)tmp.get("skill");

                for(int j=0; j<arr2.size(); j++){
                    JSONObject tmp2 = (JSONObject)arr2.get(i);

                    String SkillIndex = (String)tmp2.get(Integer.toString(0));

                    JSONArray arr3 = (JSONArray)tmp2.get(SkillIndex);

                    for(int k=0; k<arr3.size(); k++){
                        JSONObject tmp3 = (JSONObject)arr3.get(i);

                        String SkillName = (String)tmp3.get("SkillName");
                        String SkillDamage = (String)tmp3.get("damage");
                        String SkillSpeech = (String)tmp3.get("SkillSpeech");

                        data.put("SkillName", SkillName);
                        data.put(SkillName+"Damage", SkillDamage);
                        data.put(SkillName+"Speech", SkillSpeech);
                    }
                }
            }

        }
        else if(SelectMod == "PlayerData"){

        }
        return data;
    }
}
