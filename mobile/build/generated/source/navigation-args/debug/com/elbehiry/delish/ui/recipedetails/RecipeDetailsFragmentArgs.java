package com.elbehiry.delish.ui.recipedetails;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RecipeDetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private RecipeDetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private RecipeDetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipeDetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    RecipeDetailsFragmentArgs __result = new RecipeDetailsFragmentArgs();
    bundle.setClassLoader(RecipeDetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("id")) {
      int id;
      id = bundle.getInt("id");
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static RecipeDetailsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    RecipeDetailsFragmentArgs __result = new RecipeDetailsFragmentArgs();
    if (savedStateHandle.contains("id")) {
      int id;
      id = savedStateHandle.get("id");
      __result.arguments.put("id", id);
    } else {
      throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getId() {
    return (int) arguments.get("id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("id")) {
      int id = (int) arguments.get("id");
      __result.putInt("id", id);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    RecipeDetailsFragmentArgs that = (RecipeDetailsFragmentArgs) object;
    if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
      return false;
    }
    if (getId() != that.getId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getId();
    return result;
  }

  @Override
  public String toString() {
    return "RecipeDetailsFragmentArgs{"
        + "id=" + getId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(RecipeDetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int id) {
      this.arguments.put("id", id);
    }

    @NonNull
    public RecipeDetailsFragmentArgs build() {
      RecipeDetailsFragmentArgs result = new RecipeDetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setId(int id) {
      this.arguments.put("id", id);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getId() {
      return (int) arguments.get("id");
    }
  }
}
