package cc.blynk.server.handlers.app.logic;

import cc.blynk.common.model.messages.Message;
import cc.blynk.server.model.auth.User;
import io.netty.channel.ChannelHandlerContext;

import static cc.blynk.common.model.messages.MessageFactory.produce;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 *
 */
public class LoadProfileLogic {

    public static void messageReceived(ChannelHandlerContext ctx, User user, Message message) {
        String body = user.profile.toString();
        ctx.writeAndFlush(produce(message.id, message.command, body));
    }

}
