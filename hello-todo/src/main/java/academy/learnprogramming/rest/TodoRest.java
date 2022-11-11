package academy.learnprogramming.rest;

import academy.learnprogramming.entity.Todo;
import academy.learnprogramming.service.TodoService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author KonstantinosK
 */
@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {

    @Inject
    TodoService todoService;

    @Path("new")
    @POST
    public Response createTodo(Todo todo) {

        todoService.createTodo(todo);
        return Response.ok(todo).build();
    }

    @Path("update")
    @PUT
    public Response updateTodo(Todo todo) {
        todoService.updateTodo(todo);

        return Response.ok(todo).build();
    }

    @Path("{id}")
    @GET
    public Todo getTodo(@PathParam("id") Long id) {
        return todoService.findToDoById(id);
    }

    @Path("list")
    @GET
    public List<Todo> getTodos() {
        return todoService.getTodos();

    }

    @Path("status")
    @PUT
    public Response markAsCompleted(@QueryParam("id") Long id) {

        Todo todo = todoService.findToDoById(id);
        todo.setIsCompleted(true);
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }

}
