package com.gingkoo.vat.server;

import com.gingkoo.gui.service.server.exception.BizException;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FreeMarkerTemplateEngine {
    private final static Logger logger = LoggerFactory.getLogger(FreeMarkerTemplateEngine.class);

    private final Configuration configuration;

    public FreeMarkerTemplateEngine() {
        this(defaultConfiguration(), 2048L);
    }

    public FreeMarkerTemplateEngine(Configuration configuration) {
        this(configuration, 2048L);
    }

    public FreeMarkerTemplateEngine(Configuration configuration, long cacheSize) {
        this.configuration = configuration;
    }

    public Template getPath(String template) throws IOException {
        return configuration.getTemplate(template);
    }

    /**
     * FreeMarker模板配置类
     *  获取classPath 以'/'开头即为 classes类文件根目录 ，拼接resources/template/，不以'/'开头 即为该class类所在classes文件路径
     *  config.setDirectoryForTemplateLoading(new File(templatePath)); 设定模板文件所在路径
     *  配置默认字符编码格式为 UTF-8
     *  配置模板异常处理方式 TemplateExceptionHandler.RETHROW_HANDLER 如果在模板解析或生成过程中遇到任何异常，这些异常将被重新抛出，而不是被 FreeMarker 引擎捕获并静默处理
     *                   TemplateExceptionHandler.IGNORE_HANDLER 来忽略异常
     * @param
     * @return Configuration
     */
    private static Configuration defaultConfiguration() {
        String templatePath = FreeMarkerTemplateEngine.class.getResource("/resources/template/").getPath();
        Configuration config = new Configuration();
        try {
            //配置
            config.setDirectoryForTemplateLoading(new File(templatePath));
        } catch (IOException e) {
            logger.error("init template config failed ,error is : {}", e);
        }
        config.setDefaultEncoding("UTF-8");
        config.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return config;
    }

}

