### Q1. Coroutine이 뭐게?

```
   A1. Coroutine은 싱글 코어와 같은 작은 자원으로 multitasking 효과를 낼 수 있게 할 수 있는 프로그래밍 기법으로 Thread와 비교되는 개념입니다.

       어떤 Task를 수행할 때 multithread를 사용하면 CPU 입장에선 다수의 context-switching이 일어나 overhead가 커지게 됩니다.

       반면 coroutine은 context-switching을 하지 않아 제어권 전환 시 overhead가 적게 되는 장점이 있습니다. 하지만, 멀티 코어에서 지원 불가, voluntary scheduling(추후 공부)만 지원 가능하다는 단점이 있습니다.

```

  - 참조 사이트
  https://pslab.tistory.com/entry/FreeRTOS-%EC%86%8C%EA%B0%9C
  https://github.com/d-h-k/Learing-RTOS-with-STM32

  - 추후 공부할 내용
  
  MultiTasking, **Message queue, Semaphore, Memory Management**