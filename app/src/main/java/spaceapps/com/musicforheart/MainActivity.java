package spaceapps.com.musicforheart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText heartRate;
    private Button play;
    private JSONObject jsonObject;
    private Map<String, Object> map;

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heartRate = (EditText) findViewById(R.id.heartRate);
        play = (Button) findViewById(R.id.play);

        try {
            jsonObject = new JSONObject("{\"60\":[{\"url\":\"https://www.youtube.com/watch?v=GXUZSdLFGJ0\", \"type\": \"Rock\", \"name\":\"Slide it in\"}, {\"url\":\"https://www.youtube.com/watch?v=ADczoss9IYY\", \"type\": \"Rock\", \"name\":\"Turbulence\"}, {\"url\":\"https://www.youtube.com/watch?v=NM6gTE7TNe8\", \"type\": \"Rock\", \"name\":\"Santa Monica\"}, {\"url\":\"https://www.youtube.com/watch?v=BLx6fnxQw_k\", \"type\": \"Jazz/ Blues\", \"name\":\"Smooth Jazz Backing Track in C Major\"}, {\"url\":\"https://www.youtube.com/watch?v=XPqvp7zU0fg \", \"type\":\"Rap/Hip Hop\", \"name\":\"Smack That (remix)\"}, {\"url\":\"https://www.youtube.com/watch?v=caVr-VdeDvw&list:PL8613AD2409CFDE4E&index:8 \", \"type\":\"Classic\", \"name\":\"Violin Concerto No. 5 in A, 2nd Movement\"}, {\"url\":\"https://www.youtube.com/watch?v=uaTd96qdsaI\", \"type\":\"Classic\", \"name\":\"Ritornare\"}, {\"url\":\"https://www.youtube.com/watch?v=468onQOJSl8\", \"type\":\"Classic\", \"name\":\"The Nutcracker\"}, {\"url\":\"https://www.youtube.com/watch?v=HODNYfpmkBs\", \"type\":\"Pop\", \"name\":\"Culo\"}, {\"url\":\"https://www.youtube.com/watch?v=UlaBanpuYc0\", \"type\":\"House\", \"name\":\"Mine is made of\"}, {\"url\":\"https://www.youtube.com/watch?v=U4KoH2zcmxE\", \"type\":\"House\", \"name\":\"The sun rising\"}, {\"url\":\"https://www.youtube.com/watch?v=44XYEeD1A1U\", \"type\":\"Rock\", \"name\":\"T.N.T\"}, {\"url\":\"https://www.youtube.com/watch?v=_ZKZ_lQ5FWQ\", \"type\":\"Pop\", \"name\":\"Hooked on a feeling\"}],\"61\":[{\"url\":\"https://www.youtube.com/watch?v=AV_fcL_sj3Y\", \"type\":\"House\", \"name\":\"And I say\"}, {\"url\":\"https://www.youtube.com/watch?v=BYvppgDgpm0\", \"type\":\"Jazz/Blues\", \"name\":\"The dreamer\"}, {\"url\":\"https://www.youtube.com/watch?v=KsMEBEcxzYA\", \"type\":\"House\", \"name\":\"Man o to(ramix)\"}, {\"url\":\"https://www.youtube.com/watch?v=3GfYJeyQ4sI\", \"type\":\"Jazz/Blues\", \"name\":\"Go on\"}, {\"url\":\"https://www.youtube.com/watch?v=Fo0K_n3VLG4&list:PL8613AD2409CFDE4E\", \"type\":\"Classic\", \"name\":\"Double Violin Concerto in D minor (2nd movement)\"}, {\"url\":\"https://www.youtube.com/watch?v=EleQhHSIP9k&list:PL8613AD2409CFDE4E&index:5\", \"type\":\"Classic\", \"name\":\"Orchestral Suite (Ouverture) No. 3 in D Major\"}, {\"url\":\"https://www.youtube.com/watch?v=ju3w462bD5Y\", \"type\":\"Classic\", \"name\":\"Waltz of the flowers\"}, {\"url\":\"https://www.youtube.com/watch?v=B3mINTjVyEw\", \"type\":\"Pop\", \"name\":\"Victory\"}, {\"url\":\"https://www.youtube.com/watch?v=iK9Iio7WgaI\", \"type\":\"Pop\", \"name\":\"Flaws And All\"}, {\"url\":\"https://www.youtube.com/watch?v=UKp2CrfmVfw\", \"type\":\"Pop\", \"name\":\"Here\"}],\"62\":[{\"url\":\"https://www.youtube.com/watch?v=npsWBXR6dcg\", \"type\":\"Rock\", \"name\":\"The least I can do\"}, {\"url\":\"https://www.youtube.com/watch?v=0hAEc4k8f40\", \"type\":\"Rock\", \"name\":\"This sad bouquet\"}, {\"url\":\"https://www.youtube.com/watch?v=qHHJvNuJtEk\", \"type\":\"Jazz/Blues\", \"name\":\"Some other time\"}, {\"url\":\"https://www.youtube.com/watch?v=iTxOKsyZ0Lw\", \"type\":\"House\", \"name\":\"Block rockin’ beats\"}, {\"url\":\"https://www.youtube.com/watch?v=BGpzGu9Yp6Y \", \"type\":\"House\", \"name\":\"Make it bun dem\"}, {\"url\":\"https://www.youtube.com/watch?v=70VrvkfjJjg\", \"type\":\"Pop\", \"name\":\"Liberian girl\"}, {\"url\":\"https://www.youtube.com/watch?v=WHoOBWbmCUc\", \"type\":\"Pop\", \"name\":\"Beggin\"}, {\"url\":\"https://www.youtube.com/watch?v=yyDUC1LUXSU\", \"type\":\"Pop\", \"name\":\"Blurred lines\"}, {\"url\":\"https://www.youtube.com/watch?v=p1PUeYGCFgM\", \"type\":\"Rap/Hip Hop\", \"name\":\"62 BPM\"}, {\"url\":\"https://www.youtube.com/watch?v=EAgfrE28gpc\", \"type\":\"Rap/Hip hop\", \"name\":\"GhettoMusick\"}, {\"url\":\"https://www.youtube.com/watch?v=3_g6ksKqQng\", \"type\":\"Classic\", \"name\":\"American Polyphony\"}, {\"url\":\"https://www.youtube.com/watch?v=8x4GC0-Z0ZI\", \"type\":\"Classic\", \"name\":\"Autumn\"}, {\"url\":\"https://www.youtube.com/watch?v=2gsYr2l4RJA\", \"type\":\"House\", \"name\":\"Electro House 2012 Dance Mix 62\"}],\"63\":[{\"url\":\"https://www.youtube.com/watch?v=1TO48Cnl66w\", \"type\":\"Pop\", \"name\":\"Thank you\"}, {\"url\":\"https://www.youtube.com/watch?v=zP50Ewh31E4\", \"type\":\"House\", \"name\":\"Too close\"}, {\"url\":\"https://www.youtube.com/watch?v=5ZtMHSOq50Q\", \"type\":\"Rock\", \"name\":\"Battle cry\"}, {\"url\":\"https://www.youtube.com/watch?v=VESkyB5a8OY\", \"type\":\"Rock\", \"name\":\"Cupid\"}, {\"url\":\"https://www.youtube.com/watch?v=JWXhFVqNgQs\", \"type\":\"Rock\", \"name\":\"I wanna rock\"}, {\"url\":\"https://www.youtube.com/watch?v=4ajPPWN7R7A\", \"type\":\"Jazz/Blues\", \"name\":\"Gee Baby, Ain't I Good To You\"}, {\"url\":\"https://www.youtube.com/watch?v=L29TNb4eXz4\", \"type\":\"Jazz/Blues\", \"name\":\"Oh sorrow\"}, {\"url\":\"https://www.youtube.com/watch?v=elVF7oG0pQs\", \"type\":\"Rap/Hip Hop\", \"name\":\"Heard 'Em Say\"}, {\"url\":\"https://www.youtube.com/watch?v=2zNSgSzhBfM\", \"type\":\"Rap/Hip Hop\", \"name\":\"Can't Hold Us\"}],\"64\":[ {\"url\":\"https://www.youtube.com/watch?v=bAZjHg1FpX0\", \"type\":\"Rap/Hip Hop\", \"name\":\"Shawty It's Your Booty\"}, {\"url\":\"https://www.youtube.com/watch?v=u8kWe2LSEcE\", \"type\":\"Rap/Hip hop\", \"name\":\"56 Bars\"}, {\"url\":\"https://www.youtube.com/watch?v=PaI1sLqFOuE\", \"type\":\"Pop\", \"name\":\"Everybody’s got to learn sometime\"}, {\"url\":\"https://www.youtube.com/watch?v=Sv6dMFF_yts\", \"type\":\"Pop\", \"name\":\"We are young\"}, {\"url\":\"https://www.youtube.com/watch?v=IQTzlGLvCAU\", \"type\":\"Houes\", \"name\":\"GDFR\"}, {\"url\":\"https://www.youtube.com/watch?v=YqeW9_5kURI\", \"type\":\"Houes\", \"name\":\"Lean on\"}],\"65\":[{\"url\":\"https://www.youtube.com/watch?v=OJ380x7qnvE\", \"type\":\"Houes\", \"name\":\"Timber/Counting Stars Mashup\"}, {\"url\":\"https://www.youtube.com/watch?v=IpJkCti8IL0\", \"type\":\"Rock\", \"name\":\"Emilie Autumn\"}, {\"url\":\"https://www.youtube.com/watch?v=Ms97mz3H69E\", \"type\":\"Jazz/Blues\", \"name\":\"Amy, Amy, Amy\"}, {\"url\":\"https://www.youtube.com/watch?v=qRKNw477onU\", \"type\":\"Jazz/Blues\", \"name\":\"On the road again\"}, {\"url\":\"https://www.youtube.com/watch?v=uHTElr2hKEQ\", \"type\":\"Rap/Hip Hop\", \"name\":\"Boombox\"}, {\"url\":\"https://www.youtube.com/watch?v=nGdFHJXciAQ\", \"type\":\"Classic\", \"name\":\"Winter\"}, {\"url\":\"https://www.youtube.com/watch?v=BeRBFi1DLV8\", \"type\":\"Pop\", \"name\":\"Here Comes The Weekend'\"}],\"66\":[{\"url\":\"https://www.youtube.com/watch?v=bU0tKzy5-uE\", \"type\":\"Houes\", \"name\":\"Painting greys\"}, {\"url\":\"https://www.youtube.com/watch?v=LM7gZh9JWnA\", \"type\":\"Rock\", \"name\":\"Believe\"}, {\"url\":\"https://www.youtube.com/watch?v=jVqR2PwX428\", \"type\":\"Rock\", \"name\":\"Stuck On You\"}], \"67\":[ {\"url\":\"https://www.youtube.com/watch?v=ZEde35UbwUI\", \"type\":\"Rock\", \"name\":\"Moonage daydream\"}, {\"url\":\"https://www.youtube.com/watch?v=Lu3UbRrPLrQ\", \"type\":\"Rock\", \"name\":\"The opportune moment, fate,confidence and an encounter\"}, {\"url\":\"https://www.youtube.com/watch?v=qdeH7QhGiRg\", \"type\":\"Rap/Hip Hop\", \"name\":\"O.P.P.\"}, {\"url\":\"https://www.youtube.com/watch?v=rEbCequC52U\", \"type\":\"Rap/Hip Hop\", \"name\":\"I luv dem strippers\"}, {\"url\":\"https://www.youtube.com/watch?v=CShopT9QUzw\", \"type\":\"Classic\", \"name\":\"Swan Lake Waltz\"}], \"68\":[{\"url\":\"https://www.youtube.com/watch?v=Bznxx12Ptl0\", \"type\":\"House\", \"name\":\"I’m an Albatraoz\"}, {\"url\":\"https://www.youtube.com/watch?v=kQN6nEyBwq4\", \"type\":\"Rock\", \"name\":\"In our darkest hour\"}, {\"url\":\"https://www.youtube.com/watch?v=vMflmMBpz6Y\", \"type\":\"Jazz/Blues\", \"name\":\"Till there was you\"}, {\"url\":\"https://www.youtube.com/watch?v=ObUzFn2HyyE\", \"type\":\"Rap/Hip Hop\", \"name\":\"Light up\"}, {\"url\":\"https://www.youtube.com/watch?v=xOmB99e5rJs\", \"type\":\"Rap/Hip Hop\", \"name\":\"New slaves\"}],\"69\":[{\"url\":\"https://www.youtube.com/watch?v=2CgX6hr4FaY\", \"type\":\"Rap/Hip Hop\", \"name\":\"Nothin on ya\"}, {\"url\":\"https://www.youtube.com/watch?v=j1cR-AW3Zf0\", \"type\":\"Rap/Hip Hop\", \"name\":\"Stoner\"}, {\"url\":\"https://www.youtube.com/watch?v=1D7xR59Ld9I\", \"type\":\"Rap/Hip Hop\", \"name\":\"Wonderful life\"}, {\"url\":\"https://www.youtube.com/watch?v=_bpS-cOBK6Q\", \"type\":\"Rap/Hip Hop \",\"name\":\"Green onions\"}],\"70\":[{\"url\":\"https://www.youtube.com/watch?v=JErVP6xLZwg\", \"type\":\"Jazz/Blues\", \"name\":\"L.O.V.E\"}, {\"url\":\"https://www.youtube.com/watch?v=Qwv3owfP1y0&spfreload:10 \", \"type\":\"Rock\", \"name\":\"Sail on soothsayer\"}, {\"url\":\"https://www.youtube.com/watch?v=xRl08KFeAxo\", \"type\":\"Rock\", \"name\":\"I am so tired\"}, {\"url\":\"https://www.youtube.com/watch?v=Zf-fORxQvW0\", \"type\":\"Jazz/Blues\", \"name\":\"My way\"}, {\"url\":\"https://www.youtube.com/watch?v=AUzVfJQvKLI\", \"type\":\"Jazz/Blues\", \"name\":\"Running on faith (Unplugged)\"}, {\"url\":\"https://www.youtube.com/watch?v=cu-dxO_qRgE\", \"type\":\"Rap/Hip Hop\", \"name\":\"All white everything\"}, {\"url\":\"https://www.youtube.com/watch?v=X8LUd51IuiA\", \"type\":\"Rap Hip/Hop\", \"name\":\"Gas Pedal\"}, {\"url\":\"https://www.youtube.com/watch?v=l-dYNttdgl0\", \"type\":\"Classic\", \"name\":\"Spring\"}, {\"url\":\"https://www.youtube.com/watch?v=j81Xz2Becho\", \"type\":\"Classic\", \"name\":\"Vagharshapat dance\"}],\"72\":[{\"url\":\"https://www.youtube.com/watch?v=EkHTsc9PU2A\", \"type\":\"Pop\", \"name\":\"I’m yours\"}, {\"url\":\"https://www.youtube.com/watch?v=5NTqZ347TKY\", \"type\":\"Rock\", \"name\":\"Hotel California\"}, {\"url\":\"https://www.youtube.com/watch?v=4q13GXuS9OY\", \"type\":\"Rap/Hip Hop\", \"name\":\"Days like this\"}, {\"url\":\"https://www.youtube.com/watch?v=sf6LD2B_kDQ \",\"type\":\"House\",\"name\":\"Elements\"}],\"73\":[{\"url\":\"https://www.youtube.com/watch?v=5A-4VGfx5lU\", \"type\":\"Rock\", \"name\":\"House of the rising sun\"}, {\"url\":\"https://www.youtube.com/watch?v=v86fJnQ-wZw\", \"type\":\"House\", \"name\":\"Lordly\"}, {\"url\":\"https://www.youtube.com/watch?v=djTJDKAWGzk\", \"type\":\"Classic\", \"name\":\"Shogher djan\"}],\"74\":[{\"url\":\"https://www.youtube.com/watch?v=9bAoq7k3tZ0 \", \"type\":\"Rock\", \"name\":\"Dream on\"}, {\"url\":\"https://www.youtube.com/watch?v=DksSPZTZES0 \", \"type\":\"Pop\", \"name\":\"Cry me a river\"}, {\"url\":\"https://www.youtube.com/watch?v=3rQEbQJx5Bo \", \"type\":\"Jazz/Blues\", \"name\":\"All shook up\"}, {\"url\":\"https://www.youtube.com/watch?v=3J7WlzenM70 \", \"type\":\"Rap/Hip Hop\", \"name\":\"Never giving up\"}, {\"url\":\"https://www.youtube.com/watch?v=LWsM5CAsafs \", \"type\":\"Rock\", \"name\":\"Fallen\"}, {\"url\":\"https://www.youtube.com/watch?v=9g1CgvXhCo4 \", \"type\":\"Rap/Hip Hop\", \"name\":\"Strange clouds\"}],\"75\":[{\"url\":\"https://www.youtube.com/watch?v=BWf-eARnf6U \", \"type\":\"Pop\", \"name\":\"Heal the world\"}, {\"url\":\"https://www.youtube.com/watch?v=thwYQeZzpqE \", \"type\":\"House\", \"name\":\"Clark Gable\"}, {\"url\":\"https://www.youtube.com/watch?v=Z09lYqdxqzo \", \"type\":\"Rap/Hip Hop\", \"name\":\"I’m on one\"}, {\"url\":\"https://www.youtube.com/watch?v=RBumgq5yVrA \", \"type\":\"Pop\", \"name\":\"Let her go\"}, {\"url\":\"https://www.youtube.com/watch?v=fxvkI9MTQw4 \", \"type\":\"Rock\", \"name\":\"Cannonball\"}, {\"url\":\"https://www.youtube.com/watch?v=4WMmCtkhWi0 \", \"type\":\"Rock\", \"name\":\"Have faith in me\"}, {\"url\":\"https://www.youtube.com/watch?v=rrVDATvUitA \", \"type\":\"Classic\", \"name\":\"3-rd orchestral suite in D minor\"}],\"76\":[{\"url\":\"https://www.youtube.com/watch?v=lwG6vD2vP8A \", \"type\":\"Rap/Hip Hop\", \"name\":\"Get buck\"}, {\"url\":\"https://www.youtube.com/watch?v=Bbiqy2TOwBw \", \"type\":\"Rock\", \"name\":\"Let love rule\"}, {\"url\":\"https://www.youtube.com/watch?v=szj7efHG-00 \", \"type\":\"Rap/Hip Hop\", \"name\":\"Werkin girls\"}, {\"url\":\"https://www.youtube.com/watch?v=3WAZ60xA9wo \", \"type\":\"Pop\", \"name\":\"Home sweet home\"}, {\"url\":\"https://www.youtube.com/watch?v=tOxeyj7itJE \", \"type\":\"Rock\", \"name\":\"Strong Tower\"}, {\"url\":\"https://www.youtube.com/watch?v=XbGs_qK2PQA \", \"type\":\"Rap/Hip Hop\", \"name\":\"Rap god\"}],\"77\":[{\"url\":\"https://www.youtube.com/watch?v=4WzUS5qHie8 \", \"type\":\"Rock\", \"name\":\"250 Miles\"}, {\"url\":\"https://www.youtube.com/watch?v=vNoKguSdy4Y \", \"type\":\"Pop\", \"name\":\"I knew you were trouble\"}, {\"url\":\"https://www.youtube.com/watch?v=uuZE_IRwLNI \", \"type\":\"Pop\", \"name\":\"Mirrors\"}, {\"url\":\"https://www.youtube.com/watch?v=N-HXfMvU85g \", \"type\":\"Rock\", \"name\":\"Summersong\"}, {\"url\":\"https://www.youtube.com/watch?v=K8tjxXLPEtg \", \"type\":\"Rap/Hip Hop\", \"name\":\"Every chance I get\"}, {\"url\":\"https://www.youtube.com/watch?v=6A2V9Bu80J4 \", \"type\":\"House\", \"name\":\"Flower\"}],\"78\":[{\"url\":\"https://www.youtube.com/watch?v=6A2V9Bu80J4\", \"type\":\"House\", \"name\":\"Breezeblocks\"}],\"79\":[{\"url\":\"https://www.youtube.com/watch?v=e-IWRmpefzE\", \"type\":\"House\", \"name\":\"Bonfire\"}, {\"url\":\"https://www.youtube.com/watch?v=knfrxj0T5NY\", \"type\":\"House\", \"name\":\"Bad karma\"}, {\"url\":\"https://www.youtube.com/watch?v=utTP6i9TtS4\", \"type\":\"House\", \"name\":\"Red sun\"}],\"84\":[{\"url\":\"https://www.youtube.com/watch?v=eTI8hgWJh-I\", \"type\":\"Pop\", \"name\":\"Cuban Pete\"}, {\"url\":\"https://www.youtube.com/watch?v=s1JsBhRCRH0\", \"type\":\"Jazz/Blues\", \"name\":\"No diggity\"}],\"89\":[{\"url\":\"https://www.youtube.com/watch?v=fwK7ggA3-bU\", \"type\":\"Pop\", \"name\":\"One more night\"}],\"90\":[{\"url\":\"https://www.youtube.com/watch?v=1ygdAiDxKfI\", \"type\":\"Pop\", \"name\":\"Leva’s polka\"}, {\"url\":\"https://www.youtube.com/watch?v=Jws8Wp6pTKU\", \"type\":\"House\", \"name\":\"Tuesday\"}],\"92\":[{\"url\":\"https://www.youtube.com/watch?v=KRaWnd3LJfs\", \"type\":\"Pop\", \"name\":\"Payphone\"}],\"103\":[{\"url\":\"https://www.youtube.com/watch?v=I_izvAbhExY\", \"type\":\"House\", \"name\":\"Stayin’ alive\"}],\"105\":[{\"url\":\"https://www.youtube.com/watch?v=sENM2wA_FTg\", \"type\":\"Rock\", \"name\":\"It’s Time\"}, {\"url\":\"https://www.youtube.com/watch?v=R-XA3UaRcts\", \"type\":\"Classic\", \"name\":\"Spring sonata 1st movement Allegro\"}],\"110\":[{\"url\":\"https://www.youtube.com/watch?v=rR94NDIfGmA\", \"type\":\"Classic\", \"name\":\"ThePianoGuys(Mozart)\"}],\"47\":[{\"url\":\"https://www.youtube.com/watch?v=ecTm6G7AjcM\", \"type\":\"House\", \"name\":\"In this world\"}],\"56\":[{\"url\":\"https://www.youtube.com/watch?v=4Tr0otuiQuU\", \"type\":\"Classic\", \"name\":\"Moonlight sonata\"}],\"58\":[{\"url\":\"https://www.youtube.com/watch?v=9cNQFB0TDfY\", \"type\":\"Classic\", \"name\":\"Swan lake\"}]}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            map = toMap(jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rate = heartRate.getText().toString();
                if (rate.equals("")) {
                    heartRate.setError("No input");
                } else if (Integer.parseInt(rate) < 47) {
                    heartRate.setError("Too low");
                } else if (Integer.parseInt(rate) > 110) {
                    heartRate.setError("Too high");
                } else {
                    try {
                        JSONArray array = jsonObject.getJSONArray(rate.toString());
                        JSONObject unit = array.getJSONObject((int)Math.floor(Math.random() * array.length()));
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(unit.getString("url"))));
                        Log.e("url", jsonObject.getJSONArray(rate.toString()).getJSONObject(0).getString("url"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }


                }
            }
        });
    }

    public static Map<String, Object> toMap(JSONObject object) throws JSONException {
        Map<String, Object> map = new HashMap<String, Object>();

        Iterator<String> keysItr = object.keys();
        while (keysItr.hasNext()) {
            String key = keysItr.next();
            Object value = object.get(key);

            if (value instanceof JSONArray) {
                value = toList((JSONArray) value);
            } else if (value instanceof JSONObject) {
                value = toMap((JSONObject) value);
            }
            map.put(key, value);
        }
        return map;
    }

    public static List<Object> toList(JSONArray array) throws JSONException {
        List<Object> list = new ArrayList<Object>();
        for (int i = 0; i < array.length(); i++) {
            Object value = array.get(i);
            if (value instanceof JSONArray) {
                value = toList((JSONArray) value);
            } else if (value instanceof JSONObject) {
                value = toMap((JSONObject) value);
            }
            list.add(value);
        }
        return list;
    }
}
