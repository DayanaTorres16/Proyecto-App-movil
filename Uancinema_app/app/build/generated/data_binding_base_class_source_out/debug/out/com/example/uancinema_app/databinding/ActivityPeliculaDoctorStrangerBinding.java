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

public final class ActivityPeliculaDoctorStrangerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final ImageButton imageButton20;

  @NonNull
  public final ImageButton imageButton24;

  @NonNull
  public final ImageButton imageButton25;

  @NonNull
  public final ImageButton imageButton26;

  @NonNull
  public final ImageButton imageButton27;

  @NonNull
  public final ImageButton imageButtonUsuario5;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private ActivityPeliculaDoctorStrangerBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button button5, @NonNull Button button6, @NonNull ImageButton imageButton20,
      @NonNull ImageButton imageButton24, @NonNull ImageButton imageButton25,
      @NonNull ImageButton imageButton26, @NonNull ImageButton imageButton27,
      @NonNull ImageButton imageButtonUsuario5, @NonNull ImageView imageView7,
      @NonNull TextView textView8, @NonNull TextView textView9) {
    this.rootView = rootView;
    this.button5 = button5;
    this.button6 = button6;
    this.imageButton20 = imageButton20;
    this.imageButton24 = imageButton24;
    this.imageButton25 = imageButton25;
    this.imageButton26 = imageButton26;
    this.imageButton27 = imageButton27;
    this.imageButtonUsuario5 = imageButtonUsuario5;
    this.imageView7 = imageView7;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPeliculaDoctorStrangerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPeliculaDoctorStrangerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pelicula_doctor_stranger, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPeliculaDoctorStrangerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.imageButton20;
      ImageButton imageButton20 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton20 == null) {
        break missingId;
      }

      id = R.id.imageButton24;
      ImageButton imageButton24 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton24 == null) {
        break missingId;
      }

      id = R.id.imageButton25;
      ImageButton imageButton25 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton25 == null) {
        break missingId;
      }

      id = R.id.imageButton26;
      ImageButton imageButton26 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton26 == null) {
        break missingId;
      }

      id = R.id.imageButton27;
      ImageButton imageButton27 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton27 == null) {
        break missingId;
      }

      id = R.id.imageButtonUsuario5;
      ImageButton imageButtonUsuario5 = ViewBindings.findChildViewById(rootView, id);
      if (imageButtonUsuario5 == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new ActivityPeliculaDoctorStrangerBinding((ConstraintLayout) rootView, button5,
          button6, imageButton20, imageButton24, imageButton25, imageButton26, imageButton27,
          imageButtonUsuario5, imageView7, textView8, textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
