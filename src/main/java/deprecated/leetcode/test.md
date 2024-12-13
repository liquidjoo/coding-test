김성주 과제
---

## 1번
###A - 전체 주문 리스트를 가져올 때, 각 사용자(member)들이 주문 시 포인트(point)를 사용했는지 함께 알 수 있는 SQL문을 작성해주세요
```sql
select oop.order_id, m.name, if(p.payment_method = 'point', 'TRUE', 'FALSE') as is_point
from `order` as o
inner join member as m on m.id = o.member_id
left join order_option as oop on oop.order_id = o.id
left join payment as p on p.order_option_id = oop.id;
```

###B - 전체 주문리스트를 가져올 때 사용자(member)별 최근 한달간 1회 주문시 평균 구매금액이 높으며 주문 횟수가 낮은 순으로 정렬 해주세요
```sql
select m.name as member_name, ROUND(avg(oop.qty * oop.amount * 1)) as avg_amount, count(o.id) as order_count
from member as m
inner join `order` as o on m.id = o.member_id
left join order_option as oop on oop.order_id = o.id
where o.created_at between DATE_ADD(NOW(), INTERVAL -1 MONTH) AND NOW()
group by o.member_id, m.name
order by order_count;
```

###C
####1 -  올해 사용자에게 지급된 포인트의 총액, 사용금액, 미사용된 금액 그리고 유효기간이 종료된 금액을 각 월별로 추출하고 월별로 정렬하여주세요
```sql

```

####2 - 구매 실적에 따라 회원 등급을 나누려고 합니다. 회원 등급은 아래의 표와 같습니다.
```sql
select m.name, count(o.id), sum(oop.qty * oop.amount),
(
    case
    when count(o.id) >= 4 and sum(oop.qty * oop.amount) >= 10000000 then 'platinum'
    when count(o.id) >= 3 and sum(oop.qty * oop.amount) >= 5000000 then 'VIP'
    when count(o.id) >= 2 and sum(oop.qty * oop.amount) >= 3000000 then 'Friend'
    else 'Normal'
    end
) as rating
from member as m
left join `order` as o on m.id = o.member_id
left join order_option as oop on oop.order_id = o.id
where o.created_at between DATE_ADD(NOW(), INTERVAL -6 MONTH) AND NOW()
group by m.name;
```

####3 - 처음조건으로 제시한 각 테이블들의 스키마를 검토하고 수정이 필요한 데이터 타입이 있다면 기술하여 주시고 그 이유를 설명하여 주세요
- `option` 테이블 경우 `order_option` 내에 포함되어있고, 애플리케이션 상에서 관리가 될 수 있을 것 같아서 `option` 테이블이 삭제되어도 괜찮을 것 같습니다.
- `order`, `order_option` 의 `id` 값의 경우 integer 를 사용하는 것도 좋지만 많은 양의 데이터를 고려할 때 long(bigint) 타입으로 사용하는 것이 좋을 것 같습니다.
- `payment` 테이블 내의 `payment_method`의 enum 타입도 좋지만 String 타입을 사용하고 값에 대한 검수는 애플리케이션에서 하면 타입이 추가될 때 데이터베이스의 값 변경 없이 관리 할 수 있을 것 같습니다.


## 2번
### A - 1 아래의 요구사항을 듣고, 데이터베이스 구조를 설계해주세요.
![exepction hierarchy](./Exception-Hierarchy.png)
