Job Scheduler and Task Queue System Using Distributed Systems


---

Problem Statement

Modern applications require reliable execution of background jobs such as email notifications, report generation, payment processing, and scheduled cleanups. Handling these tasks synchronously leads to performance bottlenecks and poor scalability.

The Job Scheduler and Task Queue System is designed to manage and execute background jobs efficiently by decoupling job submission from execution. It ensures fault tolerance, scalability, and reliable processing of tasks in distributed environments.




---

Distributed System Architecture

The system follows a producer–consumer architecture where jobs are submitted by producers and executed asynchronously by workers. A centralized scheduler determines execution timing, while a task queue manages job distribution.

This design ensures that tasks are processed reliably even under high load, and failed tasks can be retried without affecting the main application flow.


---

Job Scheduling Mechanism

The scheduler is responsible for triggering jobs based on time-based schedules or event-driven triggers. Jobs are stored with metadata such as execution time, priority, and retry count.

At runtime, scheduled jobs are pushed into the task queue, where worker nodes pick them up for execution. This separation allows the system to handle thousands of jobs efficiently.


---

Task Queue and Message Processing

A distributed task queue is used to buffer and manage jobs awaiting execution. Each task is processed independently, ensuring parallel execution and improved throughput.

Message acknowledgment mechanisms ensure that jobs are not lost. In case of failures, tasks are re-queued and retried based on configurable policies.


---

Fault Tolerance and Reliability

The system is designed to handle failures gracefully. If a worker crashes during execution, the task remains in the queue and is reassigned to another worker.

Retry logic, dead-letter queues, and idempotent job execution ensure consistency and reliability across the system.

<img src="https://github.com/baleraopavankumar/Job_Scheduler_and_Task_Queue_System/blob/main/A.png"/>
---

Database Design

The database stores information related to jobs, execution status, schedules, and logs. Each job record maintains details such as job type, execution time, retries, and completion status.

This structured design enables monitoring, debugging, and auditing of job executions.

<img src="https://github.com/baleraopavankumar/Job_Scheduler_and_Task_Queue_System/blob/main/B.png"/>
---

Performance and Scalability

By decoupling job execution from the main application and leveraging distributed workers, the system achieves high scalability. New workers can be added dynamically to handle increased workload.

Load is evenly distributed across workers, reducing latency and ensuring optimal resource utilization.


---

Results

The Job Scheduler and Task Queue System significantly improves application responsiveness by offloading heavy operations to background workers. The system demonstrates reliable job execution, efficient retry handling, and horizontal scalability.

This architecture is suitable for real-world production systems requiring high availability and asynchronous processing.

<img src="https://github.com/your-username/job-scheduler-task-queue/blob/main/Results.png"/>
---

Directions to Download the Repository and Run the Project

1. Download and install Git from https://git-scm.com/downloads.


2. Right-click on the desired folder and select Git Bash Here.


3. Clone the repository:



git clone https://github.com/your-username/job-scheduler-task-queue.git

4. Navigate to the project directory.


5. Start required services (Redis, Kafka, MySQL) using Docker:



docker-compose up -d

6. Build and run the Spring Boot application:



mvn clean install
mvn spring-boot:run

7. Workers will automatically start consuming jobs from the queue.



That’s it. The job scheduler and task queue system should now be running.
