

package co.flock.model;

import java.util.Objects;
import com.google.gson.Gson;

/**
 * Error
 */
public class Error {
  private String error = null;

  private String description = null;

  private String parameter = null;

  private String disabledBy = null;

  public Error error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Error parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public Error disabledBy(String disabledBy) {
    this.disabledBy = disabledBy;
    return this;
  }

   /**
   * Get disabledBy
   * @return disabledBy
  **/
  public String getDisabledBy() {
    return disabledBy;
  }

  public void setDisabledBy(String disabledBy) {
    this.disabledBy = disabledBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.error, error.error) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.parameter, error.parameter) &&
        Objects.equals(this.disabledBy, error.disabledBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, description, parameter, disabledBy);
  }


  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this, Error.class);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

