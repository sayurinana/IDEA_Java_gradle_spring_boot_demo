package net.sayurinana.common.to.es;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName: SkuEsModel
 * @Package: com.ddtw.common.to.es
 * @author: DDTW
 * @createTime: 2022/07/02 15:27
 */
@Data
public class SkuEsModel {
    private Long skuId;

    private Long spuId;

    private String skuTitle;

    private BigDecimal skuPrice;

    private String skuImg;

    private Long saleCount;

    private Boolean hasStock;

    private Long hotScore;

    private Long brandId;

    private Long catelogId;

    private String brandName;

    private String brandImg;

    private String catelogName;

    private List<Attrs> attrs;

    @Data
    public static class Attrs{

        private Long attrId;
        private String attrName;
        private String attrValue;
    }
}
