package com.tws.refactoring.extract_variable;

public class BannerRender {
    public String renderBanner(String platform, String browser) {
        if ((platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"))) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
