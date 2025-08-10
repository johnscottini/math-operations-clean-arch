package com.math.operations.demo.lib.facade;

import com.math.operations.demo.lib.exceptions.BusinessException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.io.IOException;

@Component
public class UseCaseFacade {

    private final AutowireCapableBeanFactory beanFactory;

    @Autowired
    public UseCaseFacade(BeanFactory beanFactory) {
        this.beanFactory = (AutowireCapableBeanFactory) beanFactory;
    }

    public <T> T execute(UseCase<T> usecase) {
        beanFactory.autowireBean(usecase);
        try{
            return executeAndHandleExceptions(usecase);
        } finally {
            beanFactory.destroyBean(usecase);
        }
    }

    private static <T> T executeAndHandleExceptions(UseCase<T> prepared) {
        try {
            try {
                return prepared.execute();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        catch (MethodArgumentTypeMismatchException ex) {
            throw new BusinessException("Valor deve ser do tipo numérico.");
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
