// Generated by view binder compiler. Do not edit!
package com.example.uancinema_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uancinema_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPrimeraPantallaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button2;

  @NonNull
  public final ImageButton imageButton10;

  @NonNull
  public final ImageButton imageButton13;

  @NonNull
  public final ImageButton imageButton16;

  @NonNull
  public final ImageButton imageButton17;

  @NonNull
  public final ImageButton imageButton18;

  @NonNull
  public final ImageButton imageButton20;

  @NonNull
  public final ImageButton imageButton28;

  @NonNull
  public final ImageButton imageButton9;

  @NonNull
  public final ImageButton imageButtonUsuario1;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  private ActivityPrimeraPantallaBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button button2, @NonNull ImageButton imageButton10,
      @NonNull ImageButton imageButton13, @NonNull ImageButton imageButton16,
      @NonNull ImageButton imageButton17, @NonNull ImageButton imageButton18,
      @NonNull ImageButton imageButton20, @NonNull ImageButton imageButton28,
      @NonNull ImageButton imageButton9, @NonNull ImageButton imageButtonUsuario1,
      @NonNull ImageView imageView3, @NonNull ConstraintLayout main, @NonNull TextView textView3,
      @NonNull TextView textView4) {
    this.rootView = rootView;
    this.button2 = button2;
    this.imageButton10 = imageButton10;
    this.imageButton13 = imageButton13;
    this.imageButton16 = imageButton16;
    this.imageButton17 = imageButton17;
    this.imageButton18 = imageButton18;
    this.imageButton20 = imageButton20;
    this.imageButton28 = imageButton28;
    this.imageButton9 = imageButton9;
    this.imageButtonUsuario1 = imageButtonUsuario1;
    this.imageView3 = imageView3;
    this.main = main;
    this.textView3 = textView3;
    this.textView4 = textView4;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPrimeraPantallaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPrimeraPantallaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_primera_pantalla, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPrimeraPantallaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.imageButton10;
      ImageButton imageButton10 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton10 == null) {
        break missingId;
      }

      id = R.id.imageButton13;
      ImageButton imageButton13 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton13 == null) {
        break missingId;
      }

      id = R.id.imageButton16;
      ImageButton imageButton16 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton16 == null) {
        break missingId;
      }

      id = R.id.imageButton17;
      ImageButton imageButton17 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton17 == null) {
        break missingId;
      }

      id = R.id.imageButton18;
      ImageButton imageButton18 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton18 == null) {
        break missingId;
      }

      id = R.id.imageButton20;
      ImageButton imageButton20 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton20 == null) {
        break missingId;
      }

      id = R.id.imageButton28;
      ImageButton imageButton28 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton28 == null) {
        break missingId;
      }

      id = R.id.imageButton9;
      ImageButton imageButton9 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton9 == null) {
        break missingId;
      }

      id = R.id.imageButtonUsuario1;
      ImageButton imageButtonUsuario1 = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonUsuario1 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      return new ActivityPrimeraPantallaBinding((ConstraintLayout) rootView, button2, imageButton10,
          imageButton13, imageButton16, imageButton17, imageButton18, imageButton20, imageButton28,
          imageButton9, imageButtonUsuario1, imageView3, main, textView3, textView4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}