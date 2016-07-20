package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.service.MaintainService;

/**
 * ����ɾ�����Ʋ�
 * @author Zhenyu
 *
 */
@SuppressWarnings("serial")
public class DeleteOneServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ���ñ���
		req.setCharacterEncoding("UTF-8");
		// ����ҳ�洫ֵ
		String id = req.getParameter("id");
		MaintainService ms = new MaintainService();
		ms.deleteOne(id);
		// ��ҳ����ת
		req.getRequestDispatcher("/ListServlet").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
}