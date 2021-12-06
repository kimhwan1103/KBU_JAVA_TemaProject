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
        Object obj = parser.parse((reader));
        JSONObject jsonObject = (JSONObject) obj;

        if(SelectMod == "MonsterData"){
            System.out.println(SelectItem);
            JSONArray arr = (JSONArray)jsonObject.get(SelectItem);

            for(int i=0; i<arr.size(); i++){
                JSONObject tmp = (JSONObject)arr.get(i);

                String HP = (String)tmp.get("HP");
                String XP = (String)tmp.get("XP");
                String DefensivePower = (String)tmp.get("DefensivePower");
                String damage = (String)tmp.get("damage");
                String speech = (String)tmp.get("speech");

                data.put("HP", HP);
                data.put("XP", XP);
                data.put("DefensivePower", DefensivePower);
                data.put("damage", damage);
                data.put("speech", speech);

                JSONArray arr2 = (JSONArray)tmp.get("skill");
                for(int j = 0; j<arr2.size(); j++){
                    JSONObject tmp2 = (JSONObject)arr2.get(j);


                    String SkillName = (String)tmp2.get("SkillName");
                    String SkillDamage = (String)tmp2.get("damage");
                    String SkillSpeech = (String)tmp2.get("SkillSpeech");

                    data.put("SkillName", SkillName);
                    data.put(SkillName+"Damage", SkillDamage);
                    data.put(SkillName+"SkillSpeech", SkillSpeech);


                    /*
                    for(int k=0; k<arr3.size(); k++){
                        //JSONObject tmp3 = (JSONObject)arr3.get(k);


                        String SkillName = (String)tmp3.get("SkillName");
                        String SkillDamage = (String)tmp3.get("damage");
                        String SkillSpeech = (String)tmp3.get("SkillSpeech");

                        data.put("SkillName", SkillName);
                        data.put(SkillName+"Damage", SkillDamage);
                        data.put(SkillName+"SkillSpeech", SkillSpeech);


                    }
                    */


                }


            }
            /*
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

             */

        }
        else if(SelectMod == "PlayerData"){

        }
        return data;
    }
}
