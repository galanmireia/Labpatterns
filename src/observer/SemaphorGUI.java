package observer;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;
import observer.PacientThermometerGUI.TemperatureCanvas;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject 
	 * @param frame */
	private TemperatureCanvas gauges;
	
	public SemaphorGUI (Observable obs) {
		obs.addObserver(this);
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
	}

	class TemperatureCanvas extends Canvas {

		public void set(int level) {
			current = level;
		}

		public int get() {
			return current;
		}

		public int getMax() {
			return Max;
		}

		public int getMin() {
			return Min;
		}

		private int Max, Min, current;

		public TemperatureCanvas(int min, int max) {
			Min = min;
			Max = max;
		}

		public void paint(Graphics g) {
			Color c;
			if (current < 5)
				c = Color.green;
			else if (current < 10)
				c = Color.yellow;
			else
				c = Color.red;
			g.setColor(Color.black);
			g.drawRect(left, top, width, height);
			g.setColor(c);
			g.fillOval(left - width / 2, top + height - width / 3, width * 2, width * 2);
			g.setColor(Color.black);
			g.drawOval(left - width / 2, top + height - width / 3, width * 2, width * 2);
			g.setColor(Color.white);
			g.fillRect(left + 1, top + 1, width - 1, height - 1);
			g.setColor(c);
			long redtop = height * (get() - getMax()) / (getMin() - getMax());
			g.fillRect(left + 1, top + (int) redtop, width - 1, height - (int) redtop);
		}

		private static final int width = 20;
		private static final int top = 20;
		private static final int left = 100;
		private static final int right = 250;
		private static final int height = 200;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Covid19Pacient p = (Covid19Pacient) o;
//		Obtain	the		current covidImpact	to	paint
		int farenheit = (int) p.covidImpact();
		
//		temperature	gauge	update
		repaint();
	}
}     

