package _03adapter.example02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
/**
 * ʵ�ֶ���־�ļ��Ĳ���
 */
public class LogFileOperate implements LogFileOperateApi {
	/**
	 * ��־�ļ���·�����ļ����ƣ�Ĭ���ǵ�ǰclasspath�µ�AdapterLog.log
	 */	
	private String logFilePathName = "AdapterLog.log";	
	/**
	 * ���췽���������ļ���·��������
	 * @param logFilePathName �ļ���·��������
	 */
	public LogFileOperate(String logFilePathName) {
		//���ж��Ƿ������ļ���·�������ƣ�����ǣ�
		//���������ò�������־�ļ���·��������
		if(logFilePathName!=null && logFilePathName.trim().length()>0){
			this.logFilePathName = logFilePathName;
		}
	}
	@Override
	public List<LogModel> readLogFile() {
		List<LogModel> list = null;
		ObjectInputStream oin = null;
		//�ļ�·�����ܲ�����
		try {
			File f = new File(logFilePathName);
			if (f.exists()) {
				oin = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(f))
				);
				
				list = (List<LogModel>) oin.readObject();
			}	
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if (oin!=null) {
					oin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void writeLogFile(List<LogModel> list) {
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try {
			oout = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(f))
			);
			oout.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				oout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}