package cn.edu.cqu.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController
{
	@RequestMapping(value="/imgNews.json") 
	public HashMap<String, Object> addRegInfo() throws IOException
	{
		HashMap<String, Object> results = new HashMap<String, Object>();
		
		Document doc = Jsoup.connect("http://www.cs.cqu.edu.cn/").get();
		Elements links = doc.select("#u_u4_ifocus_piclist").first().select("ul").select("li");
		LinkedList<String> urlData = new LinkedList<>();
		LinkedList<String> imgData = new LinkedList<>();
		for (Element element : links)
		{
			String url = "http://www.cs.cqu.edu.cn/" + element.select("a").attr("href");
			String imgSrc =  "http://www.cs.cqu.edu.cn" +element.select("a").select("img").attr("src");
			urlData.addLast(url);
			imgData.addLast(imgSrc);
		}
		results.put("urlData", urlData);
		results.put("imgData", imgData);
		results.put("status", 0);
		return results;
	}
}
