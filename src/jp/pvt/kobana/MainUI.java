package jp.pvt.kobana;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainUI {
	private JFrame frame; // メインフレーム
	private JPanel panel; // アイコン表示パネル
	private Container contentPane; // コンポーネント追加管理

	MainUI() {
		frame = new JFrame("Main UI");
		panel = new JPanel();
		contentPane = frame.getContentPane();
	}

	/**
	 * @brief 最初に必要な画面とそのコンポーネントをすべて表示する。
	 */
	public void show() {
		this.showTop();
		this.showIcons();
		frame.setVisible(true);
	}

	/**
	 * @brief トップ画面を表示する。
	 */
	private void showTop(){
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @brief アイコンを表示する。登録されたアイコンの情報を取得し、表示する。
	 */
	private void showIcons() {
		ImageIcon icon = new ImageIcon("./img/icon/scan.jpg");
		JButton button = new JButton("ボタン", icon);
		panel.add(button);
		contentPane.add(panel, BorderLayout.CENTER);
	}
}
