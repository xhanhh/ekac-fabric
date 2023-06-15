package top.ilov.mcmods.ekac.util;

import com.google.gson.annotations.SerializedName;

public class UpdateData {

    @SerializedName("version_tag")
    private String versionTag;

    @SerializedName("version_name")
    private String versionName;

    @SerializedName("update_time")
    private long updateTime;

    @SerializedName("mr_link")
    private String modrinthLink;

    @SerializedName("cf_link")
    private String curseforgeLink;

    public String getVersionTag() {
        return versionTag;
    }

    public String getVersionName() {
        return versionName;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public String getModrinthLink() {
        return modrinthLink;
    }

    public String getCurseforgeLink() {
        return curseforgeLink;
    }
}
