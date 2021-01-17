package processor;

import annotation.TestAnno;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author XiaoLOrange
 * @time 2020.12.29
 * @title 注解处理器
 * https://blog.csdn.net/github_35180164/article/details/52055994
 */

//@SupportedAnnotationTypes({
//		//合法注解全名的集合，
//		//代替getSupportedAnnotationTypes方法
//})
////google开发的用于生成配置文件的注解
//@AutoService
public class MyProcessor extends AbstractProcessor {

	private Types typeUtils;
	private Elements elementUtils;
	private Filer filer;
	private Messager messager;

	/**
	 * 每一个注解处理器类都必须有一个空的构造函数。
	 * 然而，这里有一个特殊的init()方法，
	 * 它会被注解处理工具调用，
	 * 并输入ProcessingEnviroment参数。
	 * ProcessingEnviroment提供很多有用的工具类Elements,
	 * Types和Filer。
	 * @param processingEnv environment to access facilities the tool framework
	 *                      provides to the processor
	 * @throws IllegalStateException if this method is called more than once.
	 */
	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		super.init(processingEnv);
		typeUtils = processingEnv.getTypeUtils();
		elementUtils = processingEnv.getElementUtils();
		filer = processingEnv.getFiler();
		messager = processingEnv.getMessager();
	}

	/**
	 * 里你必须指定，这个注解处理器是注册给哪个注解的。
	 * 注意，它的返回值是一个字符串的集合，
	 * 包含本处理器想要处理的注解类型的合法全称。
	 * 换句话说，你在这里定义你的注解处理器注册到哪些注解上。
	 * @return the names of the annotation types supported by this
	 * processor, or an empty set if none
	 */
	@Override
	public Set<String> getSupportedAnnotationTypes() {
		Set<String> annotaions = new LinkedHashSet<>();
		annotaions.add(TestAnno.class.getCanonicalName());
		return annotaions;
	}

	/**
	 * 用来指定你使用的Java版本。
	 * 通常这里返回SourceVersion.latestSupported()。
	 * 然而，如果你有足够的理由只支持Java 6的话，
	 * 你也可以返回SourceVersion.RELEASE_6。
	 * @return the latest source version supported by this processor
	 */
	@Override
	public SourceVersion getSupportedSourceVersion() {
		return SourceVersion.latestSupported();
	}

	/**
	 * 这相当于每个处理器的主函数main()。
	 * 你在这里写你的扫描、评估和处理注解的代码，
	 * 以及生成Java文件。输入参数RoundEnviroment，
	 * 可以让你查询出包含特定注解的被注解元素。
	 * @param annotations
	 * @param roundEnv
	 */
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

		this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "打印异常信息22！");
		return false;
	}

}
