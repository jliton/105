package API;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetDetails {

@SerializedName("UUID")
@Expose
private Integer uUID;
@SerializedName("lastName")
@Expose
private String lastName;
@SerializedName("FistName")
@Expose
private String fistName;

public Integer getUUID() {
return uUID;
}

public void setUUID(Integer uUID) {
this.uUID = uUID;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getFistName() {
return fistName;
}

public void setFistName(String fistName) {
this.fistName = fistName;
}

}