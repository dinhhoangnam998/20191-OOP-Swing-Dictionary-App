package org.group.utils.audio;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TTSUtil {
	private static final VoiceManager vm;
	private static final Voice v;
	static {
		vm = VoiceManager.getInstance();
		v = vm.getVoice("kevin16");
		v.allocate();
	}

	public static void speech(String text) {
		v.speak(text);
	}
}
