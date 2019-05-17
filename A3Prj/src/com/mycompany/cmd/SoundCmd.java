package com.mycompany.cmd;
import com.mycompany.a3.BGSound;
import com.mycompany.a3.Game;
import com.codename1.ui.CheckBox;  
import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a3.GameWorld;

public class SoundCmd extends Command 
{
	private CheckBox soundCB;
	private GameWorld gw;

	
	public SoundCmd(GameWorld gw, CheckBox soundCB)
	{
		super("Sound ON/OFF");
		this.gw = gw;
		this.soundCB = soundCB;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (soundCB.isSelected())
		{
			System.out.println("Sound turned on");
			gw.playMusic();
		}
		else
		{
			gw.pauseMusic();
			System.out.println("Sound turned off");
		}
		gw.setSound();
	}


}
