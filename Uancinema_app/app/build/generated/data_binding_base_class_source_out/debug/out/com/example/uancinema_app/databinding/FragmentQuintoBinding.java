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

public final class FragmentQuintoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button7;

  @NonNull
  public final ImageButton imageButton33;

  @NonNull
  public final ImageButton imageButton34;

  @NonNull
  public final ImageButton imageButton35;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final TextView textView13;

  private FragmentQuintoBinding(@NonNull ConstraintLayout rootView, @NonNull Button button7,
      @NonNull ImageButton imageButton33, @NonNull ImageButton imageButton34,
      @NonNull ImageButton imageButton35, @NonNull ImageView imageView17,
      @NonNull TextView textView13) {
    this.rootView = rootView;
    this.button7 = button7;
    this.imageButton33 = imageButton33;
    this.imageButton34 = imageButton34;
    this.imageButton35 = imageButton35;
    this.imageView17 = imageView17;
    this.textView13 = textView13;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQuintoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQuintoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_quinto, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQuintoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.imageButton33;
      ImageButton imageButton33 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton33 == null) {
        break missingId;
      }

      id = R.id.imageButton34;
      ImageButton imageButton34 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton34 == null) {
        break missingId;
      }

      id = R.id.imageButton35;
      ImageButton imageButton35 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton35 == null) {
        break missingId;
      }

      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      return new FragmentQuintoBinding((ConstraintLayout) rootView, button7, imageButton33,
          imageButton34, imageButton35, imageView17, textView13);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
