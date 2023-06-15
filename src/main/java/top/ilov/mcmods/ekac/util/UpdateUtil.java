package top.ilov.mcmods.ekac.util;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import top.ilov.mcmods.ekac.Config;
import top.ilov.mcmods.ekac.ekaCMod;

import java.io.IOException;

public class UpdateUtil {

    public static CloseableHttpClient client;
    public static HttpGet httpGet;
    public static CloseableHttpResponse response;
    public static HttpEntity entity;

    public static void CheckUpdate() throws IOException {

        if(getConfig().checkForUpdate) {

            ekaCMod.LOGGER.info("Checking ekac mod updates...");

            try {

                client = HttpClients.createDefault();
                httpGet = new HttpGet("https://mcapis.ilov.top/update/ekac/mc1.20/latest.json");
                response = client.execute(httpGet);
                entity = response.getEntity();

            } catch (IOException ignored) {

            }

            if (entity != null) {

                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode != HttpStatus.SC_OK) {

                    ekaCMod.LOGGER.error("Check ekac mod updates failed, Http status: " + response.getStatusLine());

                } else {

                    String responseEntity = EntityUtils.toString(entity, "UTF-8");
                    EntityUtils.consume(entity);

                    //ekaCMod.LOGGER.info(responseEntity);

                    Gson gson = new Gson();
                    UpdateData updateData = gson.fromJson(responseEntity, UpdateData.class);
                    //ekaCMod.LOGGER.info(updateData.getVersionTag());

                    int latestVersion = Integer.parseInt(updateData.getVersionTag());

                    if (ekaCMod.VERSION_TAG < latestVersion) {

                        ekaCMod.LOGGER.info("Find a new version: " + updateData.getVersionName());

                    }
                }
            } else {

                ekaCMod.LOGGER.error("Failed to check updates.");

            }

        }
    }

    public static Config getConfig() {
        return Config.config.getConfig();
    }

}
