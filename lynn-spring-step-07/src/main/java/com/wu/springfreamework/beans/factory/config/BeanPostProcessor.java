/**
 * Author:   Lynn
 * Date:     2022/3/10 23:17
 */
package com.wu.springfreamework.beans.factory.config;

/**
 * @author Lynn
 * @create 2022/3/10
 */
public interface BeanPostProcessor {

    Object postProcessorBeforeInitiation();

    Object postProcessorAfterInitiation();

}