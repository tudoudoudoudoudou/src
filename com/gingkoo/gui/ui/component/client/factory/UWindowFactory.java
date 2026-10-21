package com.gingkoo.gui.ui.component.client.factory;

import com.gingkoo.gui.core.client.config.BaseConfig;
import com.gingkoo.gui.core.client.context.ContextHelper;
import com.gingkoo.gui.ui.component.client.UComponent;
import com.gingkoo.gui.ui.component.client.basic.UWindow;
import com.gingkoo.gui.ui.component.client.view.PageView;

public class UWindowFactory extends UIComponentFactory {
	
	private static UWindowFactory instance;
	
	private UWindowFactory() {
	}

	public UWindow getWindow(BaseConfig config, final PageView pageView) {
		UWindow window = new UWindow();

		//window.setStyleName("gui-window");
		//window.setOpacity(50);
		window.setIsModal(true);
		window.setShowModalMask(true);
		window.setZIndex(1500);
		
		super.commonSetting(window, config, pageView);
		
		if (ContextHelper.getContext().getContextData().containsKey("__HEIGHT__"))
		{
			int xx = window.getHeight();
			int maxheight = Integer.parseInt(ContextHelper.getContext().getContextData().get("__HEIGHT__"));
			if (xx > maxheight)
				window.setHeight(maxheight);
			else
				window.setAutoSize(true);
		}
		
		/*
		String autoSize = (String) config.get("autoSize");
		if (autoSize != null && !"".equals(autoSize.trim())) {
			window.setAutoSize(Boolean.parseBoolean(autoSize));
		} else {
			window.setAutoSize(true);
		}
		*/
		
		String autoCenter = (String) config.get("autoCenter");
		if (autoCenter != null && !"".equals(autoCenter.trim())) {
			window.setAutoCenter(Boolean.parseBoolean(autoCenter));
		} else {
			window.setAutoCenter(true);
		}
		
		String draggable = (String) config.get("draggable");
		if (draggable != null && !"".equals(draggable.trim())) {
			window.setCanDrag(Boolean.parseBoolean(draggable));
			window.setCanDragReposition(Boolean.parseBoolean(draggable));
		}
		
		String canDragResize = (String) config.get("canDragResize");
		if (canDragResize != null && !"".equals(canDragResize.trim())) {
			window.setCanDragResize(Boolean.parseBoolean(canDragResize));
		}
		
		String showMaximizeButton = (String) config.get("showMaximizeButton");
		if (showMaximizeButton != null && !"".equals(showMaximizeButton.trim())) {
			window.setShowMaximizeButton(Boolean.parseBoolean(showMaximizeButton));
		}
		
		String showMinimizeButton = (String) config.get("showMinimizeButton");
		if (showMinimizeButton != null && !"".equals(showMinimizeButton.trim())) {
			window.setShowMinimizeButton(Boolean.parseBoolean(showMinimizeButton));
		}
		
		String isModal = (String) config.get("isModal");
		if (isModal != null && !"".equals(isModal.trim())) {
			if (!Boolean.parseBoolean(isModal))
				window.setIsModal(Boolean.parseBoolean(isModal));
		}
		
		window.centerInPage();
		
		
		return window;
	}
	
	public static UWindowFactory getInstance() {
		if(UWindowFactory.instance == null) {
			UWindowFactory.instance = new UWindowFactory();
		}
		return UWindowFactory.instance;
	}

	@Override
	public UComponent build(BaseConfig config, PageView pageView) {
		return this.getWindow(config, pageView);
	}

}
