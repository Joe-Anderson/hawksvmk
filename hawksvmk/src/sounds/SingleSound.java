// SingleSound.java by Matt Fritz
// November 10, 2009
// Handle playing a sound only once

package sounds;

import java.applet.AudioClip;

public class SingleSound implements SoundPlayable
{
	private String name; // name of the sound
	private AudioClip sound; // sound player
	private String path = "";
	
	public SingleSound() {}
	
	public SingleSound(String name, String path, AudioClip soundFile)
	{
		this();
		
		this.name = name;
		this.path = path;
		
		// create the sound
		createSound(soundFile);
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
	// create the sound
	public void createSound(AudioClip clip)
	{
		this.sound = clip;
	}
	
	// play the sound
	public void playSound()
	{
		sound.play();
		
		System.out.println("Sound played");
	}
	
	// stop the thread and the sound
	public void stop()
	{
		sound.stop();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
