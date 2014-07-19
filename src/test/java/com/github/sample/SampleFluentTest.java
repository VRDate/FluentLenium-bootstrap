package com.github.sample;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

/**
 * @author Elio Capelati Jr
 */
@RunWith(JUnit4.class)
public class SampleFluentTest extends FluentTest {

	/**
	 *  Explore a API do Selenium/FluentLenium
	 */
	@Test
	public void firstSampleFluentTest(){
		goTo("https://www.bing.com");
		//goTo("https://www.bing.com").takeScreenShot().maximizeWindow();
        fill("#sb_form_q").with("FluentLenium");
        submit("#sb_form_go");
        assertTrue(title().contains("FluentLenium"));
	}
}
