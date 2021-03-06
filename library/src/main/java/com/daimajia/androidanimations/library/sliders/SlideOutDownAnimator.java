package com.daimajia.androidanimations.library.sliders;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-22.
 */
public class SlideOutDownAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 0),
                ObjectAnimator.ofFloat(target,"translationY",0,2000)
        );
    }
}
