package com.armandroid.armanads.interfaces.rewards.load;

public interface OnLoadRewardsApplovinMax {
    void onRewardedVideoStarted();
    void onRewardedVideoCompleted();
    void onUserRewarded();
    void onAdLoaded();
    void onAdDisplayed();
    void onAdHidden();
    void onAdClicked();
    void onAdLoadFailed();
    void onAdDisplayFailed();
}
