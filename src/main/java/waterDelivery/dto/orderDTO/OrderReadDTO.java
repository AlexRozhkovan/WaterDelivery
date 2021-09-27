package waterDelivery.dto.orderDTO;

import io.swagger.v3.oas.annotations.media.Schema;

public class OrderReadDTO
{
    @Schema(description = "Id of the order.",
            example = "1",
            required = true)
    private long id;
    @Schema( description = "Name of the order.",
            example = "[№]Order_[Name_LastName]",
            required = true )
    private String orderName;
    @Schema( description = "Status of the order.",
            example = "Order [IN PROGRESS]",
            required = true )
    private String orderStatus;
    @Schema( description = "How coast the order.",
            example = "Order Coast: [500$]",
            required = true )
    private String orderCost;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getOrderName()
    {
        return orderName;
    }

    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }

    public String getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderCost()
    {
        return orderCost;
    }

    public void setOrderCost(String orderCost)
    {
        this.orderCost = orderCost;
    }
}
