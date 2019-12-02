package org.group.utils.audio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class PlayMp3 {
	private static Player player;

	public static void playMp3(String filePath) {
		try {
			player = new Player(new FileInputStream(filePath));
			player.play();
		} catch (JavaLayerException e) {
			System.out.println("fail");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
	}
	
	public static void stop() {
		player.close();
	}
}
